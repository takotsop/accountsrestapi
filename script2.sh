#!/bin/bash

update_system()
{
    sudo apt-get update
}
install_dev_tools()
{
    sudo apt-get install -y default-jdk
    sudo apt-get install -y git
    
    wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add -
    echo deb http://pkg.jenkins.io/debian-stable binary/ | sudo tee /etc/apt/sources.list.d/jenkins.list
    sudo apt-get update
    sudo apt-get install -y jenkins

    sudo apt-get install -y python-software-properties
    curl -sL https://deb.nodesource.com/setup_7.x | sudo -E bash -

    sudo apt-get install -y nodejs
    sudo apt-get install -y npm
}
install_ethereum_tools()
{
    sudo npm install -g ethereumjs-testrpc
    sudo npm install -g solc
    sudo npm install -g truffle
    sudo npm install -g mocha
    sudo npm install -g mocha-junit-reporter
}
echo "Installing Tooling ..."
update_system
install_dev_tools
install_ethereum_tools
echo "Installation Complete."
echo "Starting Jenkins"
systemctl start jenkins

# #Takes a clean Ubuntu image, up to being Ethereum dev ready.
## installing npm from official repo https://nodejs.org/en/download/package-manager/#debian-and-ubuntu-based-linux-distributions as Ubuntu default apt-get has a very old version (NodeJS v4.1)
#curl -sL https://deb.nodesource.com/setup_8.x | sudo -E bash –
#sudo apt-get update -y && sudo apt-get upgrade -y
## install system basics
#sudo apt-get install -y build-essential nodejs
## upgrade node/npm/npx and then install dev tools
#sudo npx dist-upgrade
#sudo npm install -g ethereumjs-testrpc truffle 
## fix up permission issues. npm5 creates these as root, so user can’t modify by default
#sudo chown -R $(whoami) ~/.npm
#sudo chown -R $USER:$(id -gn $USER) ~/.config
