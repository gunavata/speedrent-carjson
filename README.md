<h1>Speedrent Car.json</h1>

My submission for the Speedrent application for Junior Software Engineer.

What I have created currently do not fullfill the full requirements of the software at the moment as i have not had any expereience running integration tests unfortunately.

Nevertheless, I will do my best to explain the current workflow.

<h2>Initialization</h2>

On starting the application (By running DemoApplication.java), it would open and listen for requests on localhost port 8080.

Currently there will be no data involved and every restart of the code will wipe the data as it is stored in memory

<h2>Interaction</h2>

The endpoints begin with "/hello". I used Postman to run tests to make sure requests and responses were correctly being received.

<h3>POST</h3>
You can begin adding content to the database by posting a request payload's body with a json object.

Generally speaking, the request body will look like this:

{ "name": "i8", "manufacturer": "BMW" }

<h3>GET</h3>

You can send a GET request to the "/hello" endpoint which will fetch all cars in the database.

You can also send a Get request to "/hello/<**ID of specific car**>" which will fetch that one car with that particular ID.

<h3>PUT</h3>

By specifying the PUT request to "/hello/<**ID of specific car**>" and containing the payload of name and manufacturer, you will be able to update the Car's information.

<h3>DELETE</h3>

With the DELETE request to "/hello/<**ID of specific car**>", you should be able to remove that car from the database.

<h2>WIP</h2>

Write an integration test that will trigger the "/hello" endpoint which will return a car object.

<h2>Requirements</h2>

* Create a Java Spring Boot application - ✓

* Add a REST GET endpoint (/hello) which return a car object as the JSON response - ~ (Not by default, data needs to be added in first)

* Car object should contains manufacturer(String) and name(String) - ✓

* Write an integration test in Spring where you consume or trigger the /hello endpoint - X (This is something i did not know about, i believe with enough time i can learn this)

* The test should call the endpoint and verify if the response contains the Car object - ~ (It works as expected but not via the integration test)

* Commit the code to github.com - ✓

<h2>Final notes</h2>

I actually have not worked with Java much nor it's related frameworks. This is mostly based of what i managed to google/youtube online.

With enough time to put into learning Java, Spring and Maven, I'm confident I will be able to produce results of a higher caliber.

Nonetheless this was a good exercise to work with and i appreciate the time taken to consider me as a candidate.

I also have a decent understanding of REST Apis and git as version control.
