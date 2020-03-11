package com.fabio.javacompletoudemy.secao019aula207.domain.entity;

import java.util.Objects;

public class Candidate implements Comparable<Candidate>{
    private String name;
    private Integer vote;

    public Candidate(String name, Integer vote) {
        this.name = name;
        this.vote = vote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVote() {
        return vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    public Integer sumVotes(Integer votes){
        return this.vote + votes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(name, candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Candidate candidate) {
        return this.getName().toLowerCase().compareTo(candidate.getName().toLowerCase());
    }

}
