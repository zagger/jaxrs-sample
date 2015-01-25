
package servlet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;
import javax.servlet.http.HttpServletResponse;

import greatgood.GreatGood;

@Path("/json")
public class ResponseJSON {

	@Context
  private HttpServletResponse responseHeader;

	@GET
	//@Produces(MediaType.TEXT_PLAIN)
	@Produces("application/json")
	public JSON sayJSON(@QueryParam("playerNum") String playerNum, @QueryParam("randNum") String randNum){
	//public String sayJSON(){
		responseHeader.setHeader("Access-Control-Allow-Origin", "*");
		GreatGood gg = new GreatGood(randNum);
		JSON jsonResponse = gg.responseJSON(playerNum);
		//JSON response = new JSON();
		return jsonResponse;
		//return "ito";
	}
}
