package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f315663a = "kotlinx.coroutines.debug";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f315664b = "kotlinx.coroutines.stacktrace.recovery";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f315665c = "auto";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f315666d = "on";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f315667e = "off";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f315668f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f315669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f315670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final AtomicLong f315671i;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r0.equals(kotlinx.coroutines.w0.f315667e) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0.equals(kotlinx.coroutines.w0.f315666d) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r0.equals("") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r0 = true;
     */
    static {
        /*
            java.lang.String r0 = "iosgte.eonxuroklnc.udsti"
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.c1.d(r0)
            r5 = 4
            r1 = 1
            r2 = 0
            r5 = 3
            if (r0 == 0) goto L39
            r5 = 7
            int r3 = r0.hashCode()
            if (r3 == 0) goto L47
            r4 = 3551(0xddf, float:4.976E-42)
            r5 = 4
            if (r3 == r4) goto L3d
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L30
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            r5 = 2
            if (r3 != r4) goto L51
            java.lang.String r3 = "auto"
            r5 = 2
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L51
            r5 = 4
            goto L39
        L30:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            r5 = 4
            if (r3 == 0) goto L51
        L39:
            r5 = 1
            r0 = r2
            r5 = 6
            goto L75
        L3d:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            r5 = 4
            if (r3 == 0) goto L51
            goto L4f
        L47:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L51
        L4f:
            r0 = r1
            goto L75
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r5 = 7
            r0 = 39
            r5 = 3
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r5 = 7
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            r5 = 0
            throw r1
        L75:
            kotlinx.coroutines.w0.f315669g = r0
            if (r0 == 0) goto L82
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.c1.f(r0, r1)
            if (r0 == 0) goto L82
            goto L83
        L82:
            r1 = r2
        L83:
            kotlinx.coroutines.w0.f315670h = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r5 = 6
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.w0.f315671i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.w0.<clinit>():void");
    }

    @kotlin.internal.f
    private static final void a(Function0<Boolean> function0) {
    }

    public static final boolean b() {
        return f315668f;
    }

    @NotNull
    public static final AtomicLong c() {
        return f315671i;
    }

    public static final boolean d() {
        return f315669g;
    }

    public static final boolean e() {
        return f315670h;
    }

    @kotlin.a1
    public static /* synthetic */ void f() {
    }

    public static final void g() {
        f315671i.set(0L);
    }
}
