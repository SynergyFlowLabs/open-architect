package com.planner5d.library.modules.user.auth;

import androidx.annotation.v;
import com.facebook.AccessToken;
import com.planner5d.library.model.manager.statistics.events.k3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Code' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
public final class SocialAuthType {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ SocialAuthType[] $VALUES;
    public static final SocialAuthType Code;
    public static final SocialAuthType Facebook = new SocialAuthType("Facebook", 0, AccessToken.f98376v, "Facebook", k3.c.facebook, com.planner5d.library.f.h.f167741q8);
    public static final SocialAuthType Google = new SocialAuthType("Google", 1, "google", "Google", k3.c.google_plus, com.planner5d.library.f.h.T8);
    private final int icon;

    @NotNull
    private final k3.c method;

    @NotNull
    private final String service;

    @NotNull
    private final String title;

    private static final /* synthetic */ SocialAuthType[] $values() {
        return new SocialAuthType[]{Facebook, Google, Code};
    }

    static {
        int i10 = 7 | 1;
        String string = com.planner5d.library.application.b.f142455c.a().S0().getString(com.planner5d.library.f.s.T7);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Code = new SocialAuthType("Code", 2, "code", string, k3.c.email, com.planner5d.library.f.h.f167611jb);
        SocialAuthType[] socialAuthTypeArr$values = $values();
        $VALUES = socialAuthTypeArr$values;
        $ENTRIES = kotlin.enums.c.c(socialAuthTypeArr$values);
    }

    private SocialAuthType(String str, int i10, String str2, @v String str3, k3.c cVar, int i11) {
        super(str, i10);
        this.service = str2;
        this.title = str3;
        this.method = cVar;
        this.icon = i11;
    }

    @NotNull
    public static kotlin.enums.a<SocialAuthType> getEntries() {
        return $ENTRIES;
    }

    public static SocialAuthType valueOf(String str) {
        return (SocialAuthType) Enum.valueOf(SocialAuthType.class, str);
    }

    public static SocialAuthType[] values() {
        return (SocialAuthType[]) $VALUES.clone();
    }

    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    public final k3.c getMethod() {
        return this.method;
    }

    @NotNull
    public final String getService() {
        return this.service;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
