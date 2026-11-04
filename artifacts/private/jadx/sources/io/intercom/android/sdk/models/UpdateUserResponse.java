package io.intercom.android.sdk.models;

import androidx.annotation.p0;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;

/* JADX INFO: loaded from: classes13.dex */
public class UpdateUserResponse extends UsersResponse {

    @p0
    private final String botBehaviourId;
    private final BotIntro botIntro;
    private final Carousel carousel;
    private final SurveyData surveyData;
    private final TeamPresence teamPresence;

    UpdateUserResponse(Builder builder) {
        super(builder);
        TeamPresence teamPresence = builder.team_presence;
        this.teamPresence = teamPresence == null ? TeamPresence.NULL : teamPresence;
        Carousel.Builder builder2 = builder.carousel;
        this.carousel = (builder2 == null ? new Carousel.Builder() : builder2).build();
        BotIntro botIntro = builder.bot_intro;
        this.botIntro = botIntro == null ? BotIntro.NULL : botIntro;
        SurveyData surveyData = builder.survey;
        this.surveyData = surveyData == null ? SurveyData.Companion.getNULL() : surveyData;
        this.botBehaviourId = builder.resolution_bot_behavior_version_id;
    }

    @p0
    public String getBotBehaviourId() {
        return this.botBehaviourId;
    }

    public BotIntro getBotIntro() {
        return this.botIntro;
    }

    public Carousel getCarousel() {
        return this.carousel;
    }

    public SurveyData getSurveyData() {
        return this.surveyData;
    }

    public TeamPresence getTeamPresence() {
        return this.teamPresence;
    }

    public static final class Builder extends UsersResponse.Builder {

        @p0
        BotIntro bot_intro;

        @p0
        Carousel.Builder carousel;

        @p0
        String resolution_bot_behavior_version_id;

        @p0
        SurveyData survey;

        @p0
        TeamPresence team_presence;

        @Override // io.intercom.android.sdk.models.UsersResponse.Builder, io.intercom.android.sdk.models.BaseResponse.Builder
        public UpdateUserResponse build() {
            return new UpdateUserResponse(this);
        }
    }
}
