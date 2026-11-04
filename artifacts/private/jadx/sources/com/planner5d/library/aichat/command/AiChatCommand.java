package com.planner5d.library.aichat.command;

import com.squareup.moshi.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@i(generateAdapter = true)
public final class AiChatCommand {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f141948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f141949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f141950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f141951d;

    public AiChatCommand() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AiChatCommand f(AiChatCommand aiChatCommand, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aiChatCommand.f141948a;
        }
        if ((i10 & 2) != 0) {
            str2 = aiChatCommand.f141949b;
        }
        if ((i10 & 4) != 0) {
            str3 = aiChatCommand.f141950c;
        }
        if ((i10 & 8) != 0) {
            str4 = aiChatCommand.f141951d;
        }
        return aiChatCommand.e(str, str2, str3, str4);
    }

    @Nullable
    public final String a() {
        return this.f141948a;
    }

    @Nullable
    public final String b() {
        return this.f141949b;
    }

    @Nullable
    public final String c() {
        return this.f141950c;
    }

    @Nullable
    public final String d() {
        return this.f141951d;
    }

    @NotNull
    public final AiChatCommand e(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new AiChatCommand(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiChatCommand)) {
            return false;
        }
        AiChatCommand aiChatCommand = (AiChatCommand) obj;
        return Intrinsics.areEqual(this.f141948a, aiChatCommand.f141948a) && Intrinsics.areEqual(this.f141949b, aiChatCommand.f141949b) && Intrinsics.areEqual(this.f141950c, aiChatCommand.f141950c) && Intrinsics.areEqual(this.f141951d, aiChatCommand.f141951d);
    }

    @Nullable
    public final String g() {
        return this.f141948a;
    }

    @Nullable
    public final String h() {
        return this.f141951d;
    }

    public int hashCode() {
        String str = this.f141948a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f141949b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f141950c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f141951d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Nullable
    public final String i() {
        return this.f141949b;
    }

    @Nullable
    public final String j() {
        return this.f141950c;
    }

    @NotNull
    public String toString() {
        return "AiChatCommand(command=" + this.f141948a + ", response=" + this.f141949b + ", title=" + this.f141950c + ", params=" + this.f141951d + ")";
    }

    public AiChatCommand(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f141948a = str;
        this.f141949b = str2;
        this.f141950c = str3;
        this.f141951d = str4;
    }

    public /* synthetic */ AiChatCommand(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
