package com.superwall.sdk.config.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class SurveyOption {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f267398id;

    @NotNull
    private final String title;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<SurveyOption> serializer() {
            return SurveyOption$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SurveyOption(int i10, String str, String str2, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, SurveyOption$$serializer.INSTANCE.getDescriptor());
        }
        this.f267398id = str;
        this.title = str2;
    }

    public static /* synthetic */ SurveyOption copy$default(SurveyOption surveyOption, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveyOption.f267398id;
        }
        if ((i10 & 2) != 0) {
            str2 = surveyOption.title;
        }
        return surveyOption.copy(str, str2);
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(SurveyOption surveyOption, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, surveyOption.f267398id);
        eVar.encodeStringElement(serialDescriptor, 1, surveyOption.title);
    }

    @NotNull
    public final String component1() {
        return this.f267398id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final SurveyOption copy(@NotNull String id2, @NotNull String title) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new SurveyOption(id2, title);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyOption)) {
            return false;
        }
        SurveyOption surveyOption = (SurveyOption) obj;
        return Intrinsics.areEqual(this.f267398id, surveyOption.f267398id) && Intrinsics.areEqual(this.title, surveyOption.title);
    }

    @NotNull
    public final String getId() {
        return this.f267398id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.f267398id.hashCode() * 31) + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return "SurveyOption(id=" + this.f267398id + ", title=" + this.title + ")";
    }

    public SurveyOption(@NotNull String id2, @NotNull String title) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f267398id = id2;
        this.title = title;
    }
}
