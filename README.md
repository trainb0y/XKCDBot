# xkcd bot
### About
![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)
![GitHub Actions](https://github.com/trainb0y/xkcdbot/actions/workflows/gradle.yml/badge.svg)


This Discord bot provides commands for the amazing webcomic [xkcd](https://xkcd.com/).  
This bot uses [Kord Extensions](https://kordex.kotlindiscord.com/) as the bot library and [JSoup](https://jsoup.org/) for parsing HTML.
### Usage
The easiest way to use the bot is to  invite the main instance to your server, using [this link](https://discord.com/api/oauth2/authorize?client_id=1004497461009727538&permissions=2147502080&scope=bot).  
A description of every command can be found using `/xkcd help`

However, if you want to run it yourself, run the jar file (using java 17 or later).  
The following .env variables are required:

```
TOKEN=<your bot token>
TEST_SERVER=<a test server id>
STATUS=<bot status>
```

### Examples
![image](https://user-images.githubusercontent.com/66213737/182714407-a87dfe6d-faa4-41fe-9e82-3d5548c93ee2.png)
![image](https://user-images.githubusercontent.com/66213737/182714457-24c83722-a25a-4907-906e-e59385a735c5.png)
