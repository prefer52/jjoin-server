package org.dongguk.jjoin.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class ClubMainPageDtoByWeb {
    private String clubImageUuid;
    private String backgroundImageUuid;
    private String introduction;
    private Timestamp startDate;
    private Timestamp endDate;

    @Builder
    public ClubMainPageDtoByWeb(String clubImageUuid, String backgroundImageUuid, String introduction, Timestamp startDate, Timestamp endDate) {
        this.clubImageUuid = clubImageUuid;
        this.backgroundImageUuid = backgroundImageUuid;
        this.introduction = introduction;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
