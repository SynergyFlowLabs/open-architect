package oi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f333635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f333636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f333637c;

    public enum a {
        STARTED,
        FINISHED;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f333641d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f333641d;
        }
    }

    public b(@NotNull String pluginName, @NotNull String handler, @NotNull a event) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f333635a = pluginName;
        this.f333636b = handler;
        this.f333637c = event;
    }

    public static /* synthetic */ b e(b bVar, String str, String str2, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.f333635a;
        }
        if ((i10 & 2) != 0) {
            str2 = bVar.f333636b;
        }
        if ((i10 & 4) != 0) {
            aVar = bVar.f333637c;
        }
        return bVar.d(str, str2, aVar);
    }

    @NotNull
    public final String a() {
        return this.f333635a;
    }

    @NotNull
    public final String b() {
        return this.f333636b;
    }

    @NotNull
    public final a c() {
        return this.f333637c;
    }

    @NotNull
    public final b d(@NotNull String pluginName, @NotNull String handler, @NotNull a event) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(event, "event");
        return new b(pluginName, handler, event);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f333635a, bVar.f333635a) && Intrinsics.areEqual(this.f333636b, bVar.f333636b) && this.f333637c == bVar.f333637c;
    }

    @NotNull
    public final a f() {
        return this.f333637c;
    }

    @NotNull
    public final String g() {
        return this.f333636b;
    }

    @NotNull
    public final String h() {
        return this.f333635a;
    }

    public int hashCode() {
        return (((this.f333635a.hashCode() * 31) + this.f333636b.hashCode()) * 31) + this.f333637c.hashCode();
    }

    @NotNull
    public String toString() {
        return "PluginTraceElement(pluginName=" + this.f333635a + ", handler=" + this.f333636b + ", event=" + this.f333637c + ')';
    }
}
