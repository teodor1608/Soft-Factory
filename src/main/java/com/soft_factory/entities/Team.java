package com.soft_factory.entities;

import javax.persistence.*;

@Entity
@Table(name="team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "leader_ID")
    private Long leaderID;

    @Column(name = "department_ID")
    private Long departmentID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getLeaderID() {
        return leaderID;
    }

    public void setLeaderID(Long leaderID) {
        this.leaderID = leaderID;
    }

    public Long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }

    public Team() {
    }

    public Team(String teamName, Long leaderID, Long departmentID) {
        this.teamName = teamName;
        this.leaderID = leaderID;
        this.departmentID = departmentID;
    }
}
