package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.g0;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f99063g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f99064h = "com.facebook.appevents.SessionInfo.sessionStartTime";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f99065i = "com.facebook.appevents.SessionInfo.sessionEndTime";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f99066j = "com.facebook.appevents.SessionInfo.interruptionCount";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f99067k = "com.facebook.appevents.SessionInfo.sessionId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Long f99068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Long f99069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private UUID f99070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f99071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Long f99072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private o f99073f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public final void a() {
            g0 g0Var = g0.f99617a;
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(g0.n()).edit();
            editorEdit.remove(m.f99064h);
            editorEdit.remove(m.f99065i);
            editorEdit.remove(m.f99066j);
            editorEdit.remove(m.f99067k);
            editorEdit.apply();
            o.f99078c.a();
        }

        @oj.n
        @Nullable
        public final m b() {
            g0 g0Var = g0.f99617a;
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(g0.n());
            long j10 = defaultSharedPreferences.getLong(m.f99064h, 0L);
            long j11 = defaultSharedPreferences.getLong(m.f99065i, 0L);
            String string = defaultSharedPreferences.getString(m.f99067k, null);
            if (j10 == 0 || j11 == 0 || string == null) {
                return null;
            }
            m mVar = new m(Long.valueOf(j10), Long.valueOf(j11), null, 4, null);
            mVar.f99071d = defaultSharedPreferences.getInt(m.f99066j, 0);
            mVar.o(o.f99078c.b());
            mVar.l(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(sessionIDStr)");
            mVar.m(uuidFromString);
            return mVar;
        }

        private a() {
        }
    }

    @oj.j
    public m(@Nullable Long l10, @Nullable Long l11) {
        this(l10, l11, null, 4, null);
    }

    @oj.n
    public static final void b() {
        f99063g.a();
    }

    @oj.n
    @Nullable
    public static final m j() {
        return f99063g.b();
    }

    @Nullable
    public final Long c() {
        Long l10 = this.f99072e;
        if (l10 == null) {
            return 0L;
        }
        return l10;
    }

    public final int d() {
        return this.f99071d;
    }

    @NotNull
    public final UUID e() {
        return this.f99070c;
    }

    @Nullable
    public final Long f() {
        return this.f99069b;
    }

    public final long g() {
        Long l10;
        if (this.f99068a == null || (l10 = this.f99069b) == null) {
            return 0L;
        }
        if (l10 != null) {
            return l10.longValue() - this.f99068a.longValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Nullable
    public final Long h() {
        return this.f99068a;
    }

    @Nullable
    public final o i() {
        return this.f99073f;
    }

    public final void k() {
        this.f99071d++;
    }

    public final void l(@Nullable Long l10) {
        this.f99072e = l10;
    }

    public final void m(@NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.f99070c = uuid;
    }

    public final void n(@Nullable Long l10) {
        this.f99069b = l10;
    }

    public final void o(@Nullable o oVar) {
        this.f99073f = oVar;
    }

    public final void p() {
        g0 g0Var = g0.f99617a;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(g0.n()).edit();
        Long l10 = this.f99068a;
        editorEdit.putLong(f99064h, l10 == null ? 0L : l10.longValue());
        Long l11 = this.f99069b;
        editorEdit.putLong(f99065i, l11 != null ? l11.longValue() : 0L);
        editorEdit.putInt(f99066j, this.f99071d);
        editorEdit.putString(f99067k, this.f99070c.toString());
        editorEdit.apply();
        o oVar = this.f99073f;
        if (oVar == null || oVar == null) {
            return;
        }
        oVar.e();
    }

    @oj.j
    public m(@Nullable Long l10, @Nullable Long l11, @NotNull UUID sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f99068a = l10;
        this.f99069b = l11;
        this.f99070c = sessionId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ m(Long l10, Long l11, UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 4) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID()");
        }
        this(l10, l11, uuid);
    }
}
