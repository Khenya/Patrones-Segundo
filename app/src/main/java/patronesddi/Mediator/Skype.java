package patronesddi.Mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Skype implements ICanalComunicacion {
	private List<Team> globalTeam = new ArrayList<>();
	private List<Team> teamQA = new ArrayList<>();
	private List<Team> teamSM = new ArrayList<>();
	private List<Team> teamDEV = new ArrayList<>();

	private HashMap<String, List<Team>> map = new HashMap<>();

	public Skype() {
		map.put("QA", teamQA);
		map.put("DEV", teamDEV);
		map.put("SM", globalTeam);
	}

	@Override
	public void sendMessage(String message, Team member) {
		List<Team> groupMembers = map.get(member.getCargo());
		for (Team teamMember : groupMembers) {
			if (!teamMember.equals(member)) {
				teamMember.reciveMessage(message);
			}
		}

	}

	public void addQA(QA memberQA) {
		teamQA.add(memberQA);
		globalTeam.add(memberQA);
	}

	public void addSM(SM memberSM) {
		teamSM.add(memberSM);
		globalTeam.add(memberSM);
	}

	public void addDEV(DEV memberDEV) {
		teamDEV.add(memberDEV);
		globalTeam.add(memberDEV);
	}
}
