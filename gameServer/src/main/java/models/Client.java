package models;

import thread.ClientThread;

import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zipfs on 2016. 06. 04..
 */
public class Client {
    private SystemUser user;
    private ClientThread clientThread;

    public Client() {
        this.selectedTeams = new ArrayList<>();
    }

    public Client(SystemUser user){
        this.user = user;
    }

    public static final int STATUS_IN_GAME = 4;
    public static final int STATUS_WAIT_FOR_GAME = 5;
    public static final int STATUS_OFFLINE = 6;
    public static final int STATUS_REDY_FOR_GAME = 7;

    private List<Team> selectedTeams;


    private DatagramSocket udpSocket;

    private String session;

    private int selectedGameType;

    private int status;

    public List<Team> getSelectedTeams() {
        return selectedTeams;
    }

    public void setSelectedTeams(List<Team> selectedTeams) {
        this.selectedTeams = selectedTeams;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public int getSelectedGameType() {
        return selectedGameType;
    }

    public void setSelectedGameType(int selectedGameType) {
        this.selectedGameType = selectedGameType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public SystemUser getUser() {
        return user;
    }

    public void setUser(SystemUser user) {
        this.user = user;
    }

    public ClientThread getClientThread() {
        return clientThread;
    }

    public void setClientThread(ClientThread clientThread) {
        this.clientThread = clientThread;
    }

    public String toMessage() {
        return user.toMessage();
    }

    public void addTeam(Team selectedTeam) {
        selectedTeams.add(selectedTeam);
    }

    public DatagramSocket getUdpSocket() {
        return udpSocket;
    }

    public void setUdpSocket(DatagramSocket udpSocket) {
        this.udpSocket = udpSocket;
    }
}
