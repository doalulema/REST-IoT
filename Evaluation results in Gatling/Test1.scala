
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Test1 extends Simulation {

	val httpProtocol = http
		.baseUrl("http://167.86.81.93:7071")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:73.0) Gecko/20100101 Firefox/73.0")

	val headers_1 = Map("Content-Type" -> "text/plain;charset=UTF-8")



	val scn = scenario("Test1")
		.exec(http("request_0")
			.get("/restS1/S1/last"))
		.pause(5)
		.exec(http("request_1")
			.post("/restS1/S1")
			.headers(headers_1)
			.body(RawFileBody("C:/Users/Doaf/Dropbox/Instaladores/gatling-charts-highcharts-bundle-3.3.1/user-files/simulations/test1/0001_request.txt")))
		.pause(5)
		.exec(http("request_2")
			.get("/restS1/S1/all"))
		.pause(5)
		.exec(http("request_3")
			.put("/restS1/S1/66")
			.headers(headers_1)
			.body(RawFileBody("C:/Users/Doaf/Dropbox/Instaladores/gatling-charts-highcharts-bundle-3.3.1/user-files/simulations/test1/0003_request.txt")))
		.pause(5)
		.exec(http("request_4")
			.get("/restS1/S1/66"))
		.pause(5)
		.exec(http("request_5")
			.delete("/restS1/S1/66")
			.headers(headers_1)
			.body(RawFileBody("C:/Users/Doaf/Dropbox/Instaladores/gatling-charts-highcharts-bundle-3.3.1/user-files/simulations/test1/0005_request.txt")))

	setUp(scn.inject(atOnceUsers(5000))).protocols(httpProtocol)
}