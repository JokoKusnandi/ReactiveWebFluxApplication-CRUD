# ReactiveWebFluxApplication-CRUD

To use the MongoDB shell on Windows, you'll need to follow these steps:

Install MongoDB:

Download the MongoDB Community Server MSI installer from the official MongoDB website: MongoDB Download Center. https://www.mongodb.com/try/download/community
Run the installer and follow the installation instructions.
Start MongoDB Server:

After installation, you need to start the MongoDB server. MongoDB server is responsible for handling requests and managing the database files.

Open a Command Prompt as an administrator.

Navigate to the MongoDB installation directory (default is C:\Program Files\MongoDB\Server\{version}\bin).

Run the following command to start the MongoDB server:

bash
Copy code
mongod
If you encounter any issues related to data directories or permissions, make sure to create a data\db directory in the MongoDB installation directory or specify a different data directory using the --dbpath option.

Start MongoDB Shell:

Open a new Command Prompt (not as administrator).

Navigate to the MongoDB installation directory's bin folder.

Run the following command to start the MongoDB shell:

bash
Copy code
mongo
This will connect to the MongoDB server running on your local machine.

Use MongoDB Shell:

Once connected, you can use the MongoDB shell to interact with the database.

For example, create a new database:

javascript
Copy code
use mydatabase
Insert a document into a collection:

javascript
Copy code
db.mycollection.insert({ key: "value" })
Query data:

javascript
Copy code
db.mycollection.find()
For a complete list of commands, you can refer to the MongoDB Shell documentation: MongoDB Shell Methods
