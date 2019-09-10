### Assets Manager
This application uses the AWS JavaScript SDK in the Browser to make the contents of an S3 bucket easy to view in a web browser.

To upload files, first navigate to the bucket & folder of your choice and then drag & drop files onto the main S3 Explorer table.

To delete files, first choose the files you want to delete by clicking checkboxes in the Select column, then click the Trash icon. You will be asked to confirm this action.


  
### Build
To start development using this template, clone the repo and use the continous build to detect changes when editing the project in an IDE like Eclipse or Visual Studio Code. Open the first command window and enter the following commands.

```console
$ mkdir -p ~/bootcamp
$ cd ~/bootcamp
$ git clone git@github.com:mpt-bootcamp/assets-manager.git
$ cd assets-manager
$ ./gradlew build -t
```

On the second command window, enter this command to run the service.

```console
$ cd ~/bootcamp/assets-manager
$ ./gradlew bootRun
````

Once the program started, open the URL with a browser.

> http://localhost:9000/