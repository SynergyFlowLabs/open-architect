package ih;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class f implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f287221e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f287222f = "[CIO]";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fh.a f287223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f287224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private ih.a f287225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Function2<? super ih.a, ? super String, Unit> f287226d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f287227a;

        static {
            int[] iArr = new int[ih.a.values().length];
            try {
                iArr[ih.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ih.a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ih.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ih.a.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f287227a = iArr;
        }
    }

    public f(@NotNull fh.a buildEnvironment, @NotNull d actualLogger) {
        Intrinsics.checkNotNullParameter(buildEnvironment, "buildEnvironment");
        Intrinsics.checkNotNullParameter(actualLogger, "actualLogger");
        this.f287223a = buildEnvironment;
        this.f287224b = actualLogger;
    }

    private final ih.a g() {
        return this.f287223a.a() ? ih.a.DEBUG : ih.a.f287212b.a();
    }

    private final void h(ih.a aVar, String str, String str2, Throwable th2) {
        if (j(aVar)) {
            Function2<? super ih.a, ? super String, Unit> function2 = this.f287226d;
            if (function2 != null) {
                function2.invoke(aVar, str);
                return;
            }
            int i10 = b.f287227a[aVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f287224b.b(f287222f, i(str2, str), th2);
                } else if (i10 == 3) {
                    this.f287224b.c(f287222f, i(str2, str));
                } else {
                    if (i10 != 4) {
                        throw new k0();
                    }
                    this.f287224b.a(f287222f, i(str2, str));
                }
            }
        }
    }

    private final String i(String str, String str2) {
        if (str == null || StringsKt.w3(str)) {
            return str2;
        }
        return "[" + str + "] " + str2;
    }

    private final boolean j(ih.a aVar) {
        return b().o() >= aVar.o();
    }

    @Override // ih.e
    public void a(@NotNull String message, @Nullable String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        h(ih.a.DEBUG, message, str, null);
    }

    @Override // ih.e
    @NotNull
    public ih.a b() {
        ih.a aVar = this.f287225c;
        return aVar == null ? g() : aVar;
    }

    @Override // ih.e
    public void c(@NotNull String message, @Nullable String str, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        h(ih.a.ERROR, message, str, th2);
    }

    @Override // ih.e
    public void d(@NotNull ih.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f287225c = value;
    }

    @Override // ih.e
    public void e(@Nullable Function2<? super ih.a, ? super String, Unit> function2) {
        this.f287226d = function2;
    }

    @Override // ih.e
    public void f(@NotNull String message, @Nullable String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        h(ih.a.INFO, message, str, null);
    }

    public /* synthetic */ f(fh.a aVar, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? new d() : dVar);
    }
}
