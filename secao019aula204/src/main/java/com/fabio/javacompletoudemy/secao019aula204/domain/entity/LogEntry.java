package com.fabio.javacompletoudemy.secao019aula204.domain.entity;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
    private String name;
    private Date logDate;

    public LogEntry(String name, Date logDate) {
        this.name = name;
        this.logDate = logDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(name, logEntry.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
