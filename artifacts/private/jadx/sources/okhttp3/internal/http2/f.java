package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.l0;
import okio.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1006:1\n84#2,4:1007\n90#2,13:1014\n90#2,13:1027\n90#2,13:1069\n90#2,13:1082\n90#2,13:1095\n90#2,13:1108\n90#2,13:1121\n90#2,13:1134\n563#3:1011\n557#3:1013\n557#3:1040\n615#3,4:1041\n402#3,5:1045\n402#3,5:1053\n402#3,5:1059\n402#3,5:1064\n1#4:1012\n37#5,2:1050\n13309#6:1052\n13310#6:1058\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n152#1:1007,4\n340#1:1014,13\n361#1:1027,13\n506#1:1069,13\n554#1:1082,13\n893#1:1095,13\n911#1:1108,13\n938#1:1121,13\n952#1:1134,13\n183#1:1011\n319#1:1013\n402#1:1040\n446#1:1041,4\n448#1:1045,5\n461#1:1053,5\n467#1:1059,5\n472#1:1064,5\n455#1:1050,2\n460#1:1052\n460#1:1058\n*E\n"})
public final class f implements Closeable {

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    public static final b f334330j3 = new b(null);

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f334331k3 = 16777216;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private static final m f334332l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final int f334333m3 = 1;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final int f334334n3 = 2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final int f334335o3 = 3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final int f334336p3 = 1000000000;
    private long H1;

    @NotNull
    private final m X;

    @NotNull
    private m Y;
    private long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f334337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f334338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<Integer, okhttp3.internal.http2.i> f334339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f334340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f334341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f334342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f334343g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.http2.j f334344g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.concurrent.d f334345h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private final d f334346h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.concurrent.c f334347i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private final Set<Integer> f334348i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.concurrent.c f334349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.concurrent.c f334350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.http2.l f334351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f334352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f334353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f334354o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private long f334355p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private long f334356p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final Socket f334357p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f334358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f334359t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f334360v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f334361w;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f334362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final okhttp3.internal.concurrent.d f334363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Socket f334364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f334365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public okio.n f334366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public okio.m f334367f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private c f334368g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private okhttp3.internal.http2.l f334369h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f334370i;

        public a(boolean z10, @NotNull okhttp3.internal.concurrent.d taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f334362a = z10;
            this.f334363b = taskRunner;
            this.f334368g = c.f334372b;
            this.f334369h = okhttp3.internal.http2.l.f334483b;
        }

        public static /* synthetic */ a z(a aVar, Socket socket, String str, okio.n nVar, okio.m mVar, int i10, Object obj) throws IOException {
            if ((i10 & 2) != 0) {
                str = jk.f.S(socket);
            }
            if ((i10 & 4) != 0) {
                nVar = l0.e(l0.v(socket));
            }
            if ((i10 & 8) != 0) {
                mVar = l0.d(l0.q(socket));
            }
            return aVar.y(socket, str, nVar, mVar);
        }

        @NotNull
        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f334362a;
        }

        @NotNull
        public final String c() {
            String str = this.f334365d;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        @NotNull
        public final c d() {
            return this.f334368g;
        }

        public final int e() {
            return this.f334370i;
        }

        @NotNull
        public final okhttp3.internal.http2.l f() {
            return this.f334369h;
        }

        @NotNull
        public final okio.m g() {
            okio.m mVar = this.f334367f;
            if (mVar != null) {
                return mVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        @NotNull
        public final Socket h() {
            Socket socket = this.f334364c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        @NotNull
        public final okio.n i() {
            okio.n nVar = this.f334366e;
            if (nVar != null) {
                return nVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        @NotNull
        public final okhttp3.internal.concurrent.d j() {
            return this.f334363b;
        }

        @NotNull
        public final a k(@NotNull c listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f334368g = listener;
            return this;
        }

        @NotNull
        public final a l(int i10) {
            this.f334370i = i10;
            return this;
        }

        @NotNull
        public final a m(@NotNull okhttp3.internal.http2.l pushObserver) {
            Intrinsics.checkNotNullParameter(pushObserver, "pushObserver");
            this.f334369h = pushObserver;
            return this;
        }

        public final void n(boolean z10) {
            this.f334362a = z10;
        }

        public final void o(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f334365d = str;
        }

        public final void p(@NotNull c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f334368g = cVar;
        }

        public final void q(int i10) {
            this.f334370i = i10;
        }

        public final void r(@NotNull okhttp3.internal.http2.l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "<set-?>");
            this.f334369h = lVar;
        }

        public final void s(@NotNull okio.m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "<set-?>");
            this.f334367f = mVar;
        }

        public final void t(@NotNull Socket socket) {
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.f334364c = socket;
        }

        public final void u(@NotNull okio.n nVar) {
            Intrinsics.checkNotNullParameter(nVar, "<set-?>");
            this.f334366e = nVar;
        }

        @oj.j
        @NotNull
        public final a v(@NotNull Socket socket) throws IOException {
            Intrinsics.checkNotNullParameter(socket, "socket");
            return z(this, socket, null, null, null, 14, null);
        }

        @oj.j
        @NotNull
        public final a w(@NotNull Socket socket, @NotNull String peerName) throws IOException {
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            return z(this, socket, peerName, null, null, 12, null);
        }

        @oj.j
        @NotNull
        public final a x(@NotNull Socket socket, @NotNull String peerName, @NotNull okio.n source) throws IOException {
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            return z(this, socket, peerName, source, null, 8, null);
        }

        @oj.j
        @NotNull
        public final a y(@NotNull Socket socket, @NotNull String peerName, @NotNull okio.n source, @NotNull okio.m sink) throws IOException {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            t(socket);
            if (this.f334362a) {
                str = jk.f.f307491i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            o(str);
            u(source);
            s(sink);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final m a() {
            return f.f334332l3;
        }

        private b() {
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f334371a = new b(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @NotNull
        public static final c f334372b = new a();

        public static final class a extends c {
            a() {
            }

            @Override // okhttp3.internal.http2.f.c
            public void f(@NotNull okhttp3.internal.http2.i stream) throws IOException {
                Intrinsics.checkNotNullParameter(stream, "stream");
                int i10 = 3 & 0;
                stream.d(okhttp3.internal.http2.b.REFUSED_STREAM, null);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public void e(@NotNull f connection, @NotNull m settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void f(@NotNull okhttp3.internal.http2.i iVar) throws IOException;
    }

    @SourceDebugExtension({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1006:1\n90#2,13:1007\n90#2,13:1020\n90#2,13:1035\n90#2,13:1049\n37#3,2:1033\n37#3,2:1062\n563#4:1048\n563#4:1064\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n687#1:1007,13\n715#1:1020,13\n758#1:1035,13\n806#1:1049,13\n753#1:1033,2\n824#1:1062,2\n797#1:1048\n841#1:1064\n*E\n"})
    public final class d implements okhttp3.internal.http2.h.c, Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final okhttp3.internal.http2.h f334373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f334374b;

        @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n1#1,218:1\n759#2,2:219\n*E\n"})
        public static final class a extends okhttp3.internal.concurrent.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f334375e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ i1.h f334376f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, f fVar, i1.h hVar) {
                super(str, z10);
                this.f334375e = fVar;
                this.f334376f = hVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // okhttp3.internal.concurrent.a
            public long f() {
                this.f334375e.Y().e(this.f334375e, (m) this.f334376f.f312751a);
                return -1L;
            }
        }

        @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n688#2,5:219\n693#2,2:226\n696#2:231\n402#3,2:224\n404#3,3:228\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n692#1:224,2\n692#1:228,3\n*E\n"})
        public static final class b extends okhttp3.internal.concurrent.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f334377e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ okhttp3.internal.http2.i f334378f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, f fVar, okhttp3.internal.http2.i iVar) {
                super(str, z10);
                this.f334377e = fVar;
                this.f334378f = iVar;
            }

            @Override // okhttp3.internal.concurrent.a
            public long f() {
                try {
                    this.f334377e.Y().f(this.f334378f);
                } catch (IOException e10) {
                    okhttp3.internal.platform.h.f334560a.g().m("Http2Connection.Listener failure for " + this.f334377e.T(), 4, e10);
                    try {
                        this.f334378f.d(okhttp3.internal.http2.b.PROTOCOL_ERROR, e10);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            }
        }

        @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n1#1,218:1\n807#2,2:219\n*E\n"})
        public static final class c extends okhttp3.internal.concurrent.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f334379e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f334380f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f334381g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, f fVar, int i10, int i11) {
                super(str, z10);
                this.f334379e = fVar;
                this.f334380f = i10;
                this.f334381g = i11;
            }

            @Override // okhttp3.internal.concurrent.a
            public long f() {
                this.f334379e.c2(true, this.f334380f, this.f334381g);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: okhttp3.internal.http2.f$d$d, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n1#1,218:1\n716#2,2:219\n*E\n"})
        public static final class C2362d extends okhttp3.internal.concurrent.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ d f334382e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f334383f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ m f334384g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2362d(String str, boolean z10, d dVar, boolean z11, m mVar) {
                super(str, z10);
                this.f334382e = dVar;
                this.f334383f = z11;
                this.f334384g = mVar;
            }

            @Override // okhttp3.internal.concurrent.a
            public long f() {
                this.f334382e.m(this.f334383f, this.f334384g);
                return -1L;
            }
        }

        public d(@NotNull f fVar, okhttp3.internal.http2.h reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f334374b = fVar;
            this.f334373a = reader;
        }

        @Override // okhttp3.internal.http2.h.c
        public void Q(int i10, int i11, @NotNull List<okhttp3.internal.http2.c> requestHeaders) throws Throwable {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f334374b.b1(i11, requestHeaders);
        }

        @Override // okhttp3.internal.http2.h.c
        public void W(boolean z10, int i10, int i11) {
            if (!z10) {
                this.f334374b.f334347i.n(new c(this.f334374b.T() + " ping", true, this.f334374b, i10, i11), 0L);
                return;
            }
            f fVar = this.f334374b;
            synchronized (fVar) {
                try {
                    if (i10 == 1) {
                        fVar.f334353n++;
                    } else if (i10 != 2) {
                        int i12 = 3 ^ 3;
                        if (i10 == 3) {
                            fVar.f334360v++;
                            Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type java.lang.Object");
                            fVar.notifyAll();
                        }
                        Unit unit = Unit.f312394a;
                    } else {
                        fVar.f334358s++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // okhttp3.internal.http2.h.c
        public void c(int i10, @NotNull okhttp3.internal.http2.b errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f334374b.g1(i10)) {
                this.f334374b.d1(i10, errorCode);
                return;
            }
            okhttp3.internal.http2.i iVarH1 = this.f334374b.h1(i10);
            if (iVarH1 != null) {
                iVarH1.A(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.h.c
        public void c0(int i10, long j10) {
            if (i10 == 0) {
                f fVar = this.f334374b;
                synchronized (fVar) {
                    fVar.H1 = fVar.y0() + j10;
                    Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type java.lang.Object");
                    fVar.notifyAll();
                    Unit unit = Unit.f312394a;
                }
                return;
            }
            okhttp3.internal.http2.i iVarW0 = this.f334374b.w0(i10);
            if (iVarW0 != null) {
                synchronized (iVarW0) {
                    iVarW0.a(j10);
                    Unit unit2 = Unit.f312394a;
                }
            }
        }

        @Override // okhttp3.internal.http2.h.c
        public void d(int i10, @NotNull okhttp3.internal.http2.b errorCode, @NotNull o debugData) {
            int i11;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.v0();
            f fVar = this.f334374b;
            synchronized (fVar) {
                try {
                    array = fVar.x0().values().toArray(new okhttp3.internal.http2.i[0]);
                    fVar.f334343g = true;
                    Unit unit = Unit.f312394a;
                } finally {
                }
            }
            for (okhttp3.internal.http2.i iVar : (okhttp3.internal.http2.i[]) array) {
                if (iVar.k() > i10 && iVar.v()) {
                    iVar.A(okhttp3.internal.http2.b.REFUSED_STREAM);
                    this.f334374b.h1(iVar.k());
                }
            }
        }

        @Override // okhttp3.internal.http2.h.c
        public void d0(int i10, @NotNull String origin, @NotNull o protocol, @NotNull String host, int i11, long j10) {
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter(host, "host");
        }

        @Override // okhttp3.internal.http2.h.c
        public void e0() {
        }

        @Override // okhttp3.internal.http2.h.c
        public void f(boolean z10, @NotNull m settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f334374b.f334347i.n(new C2362d(this.f334374b.T() + " applyAndAckSettings", true, this, z10, settings), 0L);
        }

        @Override // okhttp3.internal.http2.h.c
        public void f0(int i10, int i11, int i12, boolean z10) {
        }

        @Override // okhttp3.internal.http2.h.c
        public void i(boolean z10, int i10, int i11, @NotNull List<okhttp3.internal.http2.c> headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f334374b.g1(i10)) {
                this.f334374b.U0(i10, headerBlock, z10);
                return;
            }
            f fVar = this.f334374b;
            synchronized (fVar) {
                try {
                    okhttp3.internal.http2.i iVarW0 = fVar.w0(i10);
                    if (iVarW0 != null) {
                        Unit unit = Unit.f312394a;
                        iVarW0.z(jk.f.c0(headerBlock), z10);
                        return;
                    }
                    if (fVar.f334343g) {
                        return;
                    }
                    if (i10 <= fVar.X()) {
                        return;
                    }
                    if (i10 % 2 == fVar.d0() % 2) {
                        return;
                    }
                    okhttp3.internal.http2.i iVar = new okhttp3.internal.http2.i(i10, fVar, false, z10, jk.f.c0(headerBlock));
                    fVar.l1(i10);
                    fVar.x0().put(Integer.valueOf(i10), iVar);
                    fVar.f334345h.j().n(new b(fVar.T() + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onStream", true, fVar, iVar), 0L);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            s();
            return Unit.f312394a;
        }

        @Override // okhttp3.internal.http2.h.c
        public void k(boolean z10, int i10, @NotNull okio.n source, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f334374b.g1(i10)) {
                this.f334374b.T0(i10, source, i11, z10);
                return;
            }
            okhttp3.internal.http2.i iVarW0 = this.f334374b.w0(i10);
            if (iVarW0 != null) {
                iVarW0.y(source, i11);
                if (z10) {
                    iVarW0.z(jk.f.f307484b, true);
                }
            } else {
                this.f334374b.f2(i10, okhttp3.internal.http2.b.PROTOCOL_ERROR);
                long j10 = i11;
                this.f334374b.J1(j10);
                source.skip(j10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, okhttp3.internal.http2.m] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void m(boolean z10, @NotNull m settings) {
            ?? r13;
            long jE;
            int i10;
            okhttp3.internal.http2.i[] iVarArr;
            Intrinsics.checkNotNullParameter(settings, "settings");
            i1.h hVar = new i1.h();
            okhttp3.internal.http2.j jVarH0 = this.f334374b.H0();
            f fVar = this.f334374b;
            synchronized (jVarH0) {
                try {
                    synchronized (fVar) {
                        try {
                            m mVarG0 = fVar.g0();
                            if (z10) {
                                r13 = settings;
                            } else {
                                m mVar = new m();
                                mVar.j(mVarG0);
                                mVar.j(settings);
                                r13 = mVar;
                            }
                            hVar.f312751a = r13;
                            jE = ((long) r13.e()) - ((long) mVarG0.e());
                            iVarArr = (jE == 0 || fVar.x0().isEmpty()) ? null : (okhttp3.internal.http2.i[]) fVar.x0().values().toArray(new okhttp3.internal.http2.i[0]);
                            fVar.p1((m) hVar.f312751a);
                            int i11 = 7 & 1;
                            fVar.f334350k.n(new a(fVar.T() + " onSettings", true, fVar, hVar), 0L);
                            Unit unit = Unit.f312394a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    try {
                        fVar.H0().a((m) hVar.f312751a);
                    } catch (IOException e10) {
                        fVar.N(e10);
                    }
                    Unit unit2 = Unit.f312394a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (iVarArr != null) {
                for (okhttp3.internal.http2.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(jE);
                        Unit unit3 = Unit.f312394a;
                    }
                }
            }
        }

        @NotNull
        public final okhttp3.internal.http2.h n() {
            return this.f334373a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.io.Closeable, okhttp3.internal.http2.h] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void s() throws Throwable {
            okhttp3.internal.http2.b bVar;
            okhttp3.internal.http2.b bVar2 = okhttp3.internal.http2.b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f334373a.c(this);
                    while (this.f334373a.b(false, this)) {
                    }
                    okhttp3.internal.http2.b bVar3 = okhttp3.internal.http2.b.NO_ERROR;
                    try {
                        bVar2 = okhttp3.internal.http2.b.CANCEL;
                        this.f334374b.I(bVar3, bVar2, null);
                        bVar = bVar3;
                    } catch (IOException e11) {
                        e10 = e11;
                        bVar2 = okhttp3.internal.http2.b.PROTOCOL_ERROR;
                        f fVar = this.f334374b;
                        fVar.I(bVar2, bVar2, e10);
                        bVar = fVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f334374b.I(bVar, bVar2, e10);
                    jk.f.o(this.f334373a);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                this.f334374b.I(bVar, bVar2, e10);
                jk.f.o(this.f334373a);
                throw th;
            }
            this = this.f334373a;
            jk.f.o(this);
        }
    }

    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n939#2:219\n940#2,8:222\n948#2:233\n402#3,2:220\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n939#1:220,2\n939#1:230,3\n*E\n"})
    public static final class e extends okhttp3.internal.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f334385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f334386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ okio.l f334387g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f334388h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f334389i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z10, f fVar, int i10, okio.l lVar, int i11, boolean z11) {
            super(str, z10);
            this.f334385e = fVar;
            this.f334386f = i10;
            this.f334387g = lVar;
            this.f334388h = i11;
            this.f334389i = z11;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            try {
                boolean zC = this.f334385e.f334351l.c(this.f334386f, this.f334387g, this.f334388h, this.f334389i);
                if (zC) {
                    this.f334385e.H0().g(this.f334386f, okhttp3.internal.http2.b.CANCEL);
                }
                if (zC || this.f334389i) {
                    synchronized (this.f334385e) {
                        this.f334385e.f334348i3.remove(Integer.valueOf(this.f334386f));
                    }
                }
            } catch (IOException unused) {
            }
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.f$f, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n912#2,2:219\n914#2,7:223\n921#2:233\n402#3,2:221\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n913#1:221,2\n913#1:230,3\n*E\n"})
    public static final class C2363f extends okhttp3.internal.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f334390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f334391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f334392g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f334393h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2363f(String str, boolean z10, f fVar, int i10, List list, boolean z11) {
            super(str, z10);
            this.f334390e = fVar;
            this.f334391f = i10;
            this.f334392g = list;
            this.f334393h = z11;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:9:0x002c A[Catch: IOException -> 0x0044, TryCatch #1 {IOException -> 0x0044, blocks: (B:4:0x0016, B:7:0x0028, B:9:0x002c, B:10:0x002e, B:12:0x003f, B:15:0x0042, B:16:0x0043, B:11:0x002f), top: B:22:0x0016, inners: #0 }] */
        @Override // okhttp3.internal.concurrent.a
        public long f() {
            boolean zB = this.f334390e.f334351l.b(this.f334391f, this.f334392g, this.f334393h);
            if (zB) {
                try {
                    this.f334390e.H0().g(this.f334391f, okhttp3.internal.http2.b.CANCEL);
                    if (zB || this.f334393h) {
                        synchronized (this.f334390e) {
                            this.f334390e.f334348i3.remove(Integer.valueOf(this.f334391f));
                        }
                    }
                } catch (IOException unused) {
                }
            } else if (zB) {
                synchronized (this.f334390e) {
                    this.f334390e.f334348i3.remove(Integer.valueOf(this.f334391f));
                }
            } else {
                synchronized (this.f334390e) {
                    this.f334390e.f334348i3.remove(Integer.valueOf(this.f334391f));
                }
            }
            return -1L;
        }
    }

    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n894#2,2:219\n896#2,7:223\n903#2:233\n402#3,2:221\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n895#1:221,2\n895#1:230,3\n*E\n"})
    public static final class g extends okhttp3.internal.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f334394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f334395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f334396g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, f fVar, int i10, List list) {
            super(str, z10);
            this.f334394e = fVar;
            this.f334395f = i10;
            this.f334396g = list;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            if (!this.f334394e.f334351l.a(this.f334395f, this.f334396g)) {
                return -1L;
            }
            try {
                this.f334394e.H0().g(this.f334395f, okhttp3.internal.http2.b.CANCEL);
                synchronized (this.f334394e) {
                    this.f334394e.f334348i3.remove(Integer.valueOf(this.f334395f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n953#2,5:219\n*E\n"})
    public static final class h extends okhttp3.internal.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f334397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f334398f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.http2.b f334399g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, f fVar, int i10, okhttp3.internal.http2.b bVar) {
            super(str, z10);
            this.f334397e = fVar;
            this.f334398f = i10;
            this.f334399g = bVar;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f334397e.f334351l.d(this.f334398f, this.f334399g);
            synchronized (this.f334397e) {
                try {
                    this.f334397e.f334348i3.remove(Integer.valueOf(this.f334398f));
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return -1L;
        }
    }

    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n555#2,2:219\n*E\n"})
    public static final class i extends okhttp3.internal.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f334400e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, f fVar) {
            super(str, z10);
            this.f334400e = fVar;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f334400e.c2(false, 2, 0);
            return -1L;
        }
    }

    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n153#2,14:219\n*E\n"})
    public static final class j extends okhttp3.internal.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f334401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f334402f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, f fVar, long j10) {
            super(str, false, 2, null);
            this.f334401e = fVar;
            this.f334402f = j10;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            boolean z10;
            synchronized (this.f334401e) {
                try {
                    if (this.f334401e.f334353n < this.f334401e.f334352m) {
                        z10 = true;
                    } else {
                        this.f334401e.f334352m++;
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z10) {
                this.f334401e.c2(false, 1, 0);
                return this.f334402f;
            }
            int i10 = 7 >> 0;
            this.f334401e.N(null);
            return -1L;
        }
    }

    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n341#2,6:219\n*E\n"})
    public static final class k extends okhttp3.internal.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f334403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f334404f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.http2.b f334405g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, f fVar, int i10, okhttp3.internal.http2.b bVar) {
            super(str, z10);
            this.f334403e = fVar;
            this.f334404f = i10;
            this.f334405g = bVar;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            try {
                this.f334403e.e2(this.f334404f, this.f334405g);
                return -1L;
            } catch (IOException e10) {
                this.f334403e.N(e10);
                return -1L;
            }
        }
    }

    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n362#2,6:219\n*E\n"})
    public static final class l extends okhttp3.internal.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f334406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f334407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f334408g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, f fVar, int i10, long j10) {
            super(str, z10);
            this.f334406e = fVar;
            this.f334407f = i10;
            this.f334408g = j10;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            try {
                this.f334406e.H0().c0(this.f334407f, this.f334408g);
                return -1L;
            } catch (IOException e10) {
                this.f334406e.N(e10);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.k(7, 65535);
        mVar.k(5, 16384);
        f334332l3 = mVar;
    }

    public f(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean zB = builder.b();
        this.f334337a = zB;
        this.f334338b = builder.d();
        this.f334339c = new LinkedHashMap();
        String strC = builder.c();
        this.f334340d = strC;
        this.f334342f = builder.b() ? 3 : 2;
        okhttp3.internal.concurrent.d dVarJ = builder.j();
        this.f334345h = dVarJ;
        okhttp3.internal.concurrent.c cVarJ = dVarJ.j();
        this.f334347i = cVarJ;
        this.f334349j = dVarJ.j();
        this.f334350k = dVarJ.j();
        this.f334351l = builder.f();
        m mVar = new m();
        if (builder.b()) {
            mVar.k(7, 16777216);
        }
        this.X = mVar;
        m mVar2 = f334332l3;
        this.Y = mVar2;
        this.H1 = mVar2.e();
        this.f334357p2 = builder.h();
        this.f334344g3 = new okhttp3.internal.http2.j(builder.g(), zB);
        this.f334346h3 = new d(this, new okhttp3.internal.http2.h(builder.i(), zB));
        this.f334348i3 = new LinkedHashSet();
        if (builder.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.e());
            cVarJ.n(new j(strC + " ping", this, nanos), nanos);
        }
    }

    public static /* synthetic */ void E1(f fVar, boolean z10, okhttp3.internal.concurrent.d dVar, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            dVar = okhttp3.internal.concurrent.d.f334058i;
        }
        fVar.B1(z10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(IOException iOException) {
        okhttp3.internal.http2.b bVar = okhttp3.internal.http2.b.PROTOCOL_ERROR;
        I(bVar, bVar, iOException);
    }

    private final okhttp3.internal.http2.i O0(int i10, List<okhttp3.internal.http2.c> list, boolean z10) throws IOException {
        Throwable th2;
        okhttp3.internal.http2.i iVar;
        boolean z11;
        boolean z12 = !z10;
        synchronized (this.f334344g3) {
            try {
                synchronized (this) {
                    try {
                        if (this.f334342f > 1073741823) {
                            try {
                                u1(okhttp3.internal.http2.b.REFUSED_STREAM);
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                        try {
                            if (this.f334343g) {
                                throw new okhttp3.internal.http2.a();
                            }
                            int i11 = this.f334342f;
                            this.f334342f = i11 + 2;
                            iVar = new okhttp3.internal.http2.i(i11, this, z12, false, null);
                            z11 = !z10 || this.f334356p1 >= this.H1 || iVar.t() >= iVar.s();
                            if (iVar.w()) {
                                this.f334339c.put(Integer.valueOf(i11), iVar);
                            }
                            Unit unit = Unit.f312394a;
                            if (i10 == 0) {
                                this.f334344g3.f(z12, i11, list);
                            } else {
                                if (this.f334337a) {
                                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                }
                                this.f334344g3.Q(i10, i11, list);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        if (z11) {
            this.f334344g3.flush();
        }
        return iVar;
    }

    public final long B0() {
        return this.f334356p1;
    }

    @oj.j
    public final void B1(boolean z10, @NotNull okhttp3.internal.concurrent.d taskRunner) throws IOException {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        if (z10) {
            this.f334344g3.A2();
            this.f334344g3.h(this.X);
            int iE = this.X.e();
            if (iE != 65535) {
                this.f334344g3.c0(0, iE - 65535);
            }
        }
        taskRunner.j().n(new okhttp3.internal.concurrent.c.b(this.f334340d, true, this.f334346h3), 0L);
    }

    public final synchronized void H() throws InterruptedException {
        while (this.f334360v < this.f334359t) {
            try {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final okhttp3.internal.http2.j H0() {
        return this.f334344g3;
    }

    public final void I(@NotNull okhttp3.internal.http2.b connectionCode, @NotNull okhttp3.internal.http2.b streamCode, @Nullable IOException iOException) {
        int i10;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (jk.f.f307490h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            u1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f334339c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f334339c.values().toArray(new okhttp3.internal.http2.i[0]);
                    this.f334339c.clear();
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        okhttp3.internal.http2.i[] iVarArr = (okhttp3.internal.http2.i[]) array;
        if (iVarArr != null) {
            for (okhttp3.internal.http2.i iVar : iVarArr) {
                try {
                    iVar.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f334344g3.close();
        } catch (IOException unused3) {
        }
        try {
            this.f334357p2.close();
        } catch (IOException unused4) {
        }
        this.f334347i.u();
        this.f334349j.u();
        this.f334350k.u();
    }

    public final synchronized void J1(long j10) {
        try {
            long j11 = this.Z + j10;
            this.Z = j11;
            long j12 = j11 - this.f334355p0;
            if (j12 >= this.X.e() / 2) {
                i2(0, j12);
                this.f334355p0 += j12;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean M0(long j10) {
        if (this.f334343g) {
            return false;
        }
        return this.f334358s >= this.f334354o || j10 < this.f334361w;
    }

    public final void O1(int i10, boolean z10, @Nullable okio.l lVar, long j10) throws IOException {
        long j11;
        long j12;
        int iMin;
        long j13;
        boolean z11;
        if (j10 == 0) {
            this.f334344g3.F9(z10, i10, lVar, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j11 = this.f334356p1;
                            j12 = this.H1;
                            if (j11 >= j12) {
                                if (!this.f334339c.containsKey(Integer.valueOf(i10))) {
                                    throw new IOException("stream closed");
                                }
                                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th2;
                }
                iMin = Math.min((int) Math.min(j10, j12 - j11), this.f334344g3.Tb());
                j13 = iMin;
                this.f334356p1 += j13;
                Unit unit = Unit.f312394a;
            }
            j10 -= j13;
            okhttp3.internal.http2.j jVar = this.f334344g3;
            if (z10 && j10 == 0) {
                z11 = true;
                int i11 = 6 ^ 1;
            } else {
                z11 = false;
            }
            jVar.F9(z11, i10, lVar, iMin);
        }
    }

    @NotNull
    public final okhttp3.internal.http2.i Q0(@NotNull List<okhttp3.internal.http2.c> requestHeaders, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return O0(0, requestHeaders, z10);
    }

    public final boolean R() {
        return this.f334337a;
    }

    public final synchronized int R0() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f334339c.size();
    }

    @NotNull
    public final String T() {
        return this.f334340d;
    }

    public final void T0(int i10, @NotNull okio.n source, int i11, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        okio.l lVar = new okio.l();
        long j10 = i11;
        source.q1(j10);
        source.read(lVar, j10);
        this.f334349j.n(new e(this.f334340d + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onData", true, this, i10, lVar, i11, z10), 0L);
    }

    public final void T1(int i10, boolean z10, @NotNull List<okhttp3.internal.http2.c> alternating) throws IOException {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.f334344g3.f(z10, i10, alternating);
    }

    public final void U0(int i10, @NotNull List<okhttp3.internal.http2.c> requestHeaders, boolean z10) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        this.f334349j.n(new C2363f(this.f334340d + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onHeaders", true, this, i10, requestHeaders, z10), 0L);
    }

    public final int X() {
        return this.f334341e;
    }

    @NotNull
    public final c Y() {
        return this.f334338b;
    }

    public final void b1(int i10, @NotNull List<okhttp3.internal.http2.c> requestHeaders) throws Throwable {
        Throwable th2;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (!this.f334348i3.contains(Integer.valueOf(i10))) {
                    this.f334348i3.add(Integer.valueOf(i10));
                    this.f334349j.n(new g(this.f334340d + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onRequest", true, this, i10, requestHeaders), 0L);
                    return;
                }
                try {
                    f2(i10, okhttp3.internal.http2.b.PROTOCOL_ERROR);
                    return;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
            throw th2;
        }
    }

    public final void b2() throws InterruptedException {
        synchronized (this) {
            try {
                this.f334359t++;
            } finally {
            }
        }
        c2(false, 3, 1330343787);
    }

    public final void c2(boolean z10, int i10, int i11) {
        try {
            this.f334344g3.W(z10, i10, i11);
        } catch (IOException e10) {
            N(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        I(okhttp3.internal.http2.b.NO_ERROR, okhttp3.internal.http2.b.CANCEL, null);
    }

    public final int d0() {
        return this.f334342f;
    }

    public final void d1(int i10, @NotNull okhttp3.internal.http2.b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f334349j.n(new h(this.f334340d + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onReset", true, this, i10, errorCode), 0L);
    }

    public final void d2() throws InterruptedException {
        b2();
        H();
    }

    @NotNull
    public final okhttp3.internal.http2.i e1(int i10, @NotNull List<okhttp3.internal.http2.c> requestHeaders, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.f334337a) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return O0(i10, requestHeaders, z10);
    }

    public final void e2(int i10, @NotNull okhttp3.internal.http2.b statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.f334344g3.g(i10, statusCode);
    }

    @NotNull
    public final m f0() {
        return this.X;
    }

    public final void f2(int i10, @NotNull okhttp3.internal.http2.b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f334347i.n(new k(this.f334340d + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] writeSynReset", true, this, i10, errorCode), 0L);
    }

    public final void flush() throws IOException {
        this.f334344g3.flush();
    }

    @NotNull
    public final m g0() {
        return this.Y;
    }

    public final boolean g1(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    @Nullable
    public final synchronized okhttp3.internal.http2.i h1(int i10) {
        okhttp3.internal.http2.i iVarRemove;
        iVarRemove = this.f334339c.remove(Integer.valueOf(i10));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return iVarRemove;
    }

    public final void i2(int i10, long j10) {
        this.f334347i.n(new l(this.f334340d + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] windowUpdate", true, this, i10, j10), 0L);
    }

    public final long j0() {
        return this.f334355p0;
    }

    public final void j1() {
        synchronized (this) {
            try {
                long j10 = this.f334358s;
                long j11 = this.f334354o;
                if (j10 < j11) {
                    return;
                }
                this.f334354o = j11 + 1;
                this.f334361w = System.nanoTime() + ((long) 1000000000);
                Unit unit = Unit.f312394a;
                this.f334347i.n(new i(this.f334340d + " ping", true, this), 0L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final long k0() {
        return this.Z;
    }

    public final void l1(int i10) {
        this.f334341e = i10;
    }

    @NotNull
    public final d o0() {
        return this.f334346h3;
    }

    public final void o1(int i10) {
        this.f334342f = i10;
    }

    public final void p1(@NotNull m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.Y = mVar;
    }

    @NotNull
    public final Socket r0() {
        return this.f334357p2;
    }

    public final void s1(@NotNull m settings) throws IOException {
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this.f334344g3) {
            try {
                synchronized (this) {
                    try {
                        if (this.f334343g) {
                            throw new okhttp3.internal.http2.a();
                        }
                        this.X.j(settings);
                        Unit unit = Unit.f312394a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f334344g3.h(settings);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @oj.j
    public final void start() throws IOException {
        E1(this, false, null, 3, null);
    }

    public final void u1(@NotNull okhttp3.internal.http2.b statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f334344g3) {
            try {
                i1.f fVar = new i1.f();
                synchronized (this) {
                    if (this.f334343g) {
                        return;
                    }
                    this.f334343g = true;
                    int i10 = this.f334341e;
                    fVar.f312749a = i10;
                    Unit unit = Unit.f312394a;
                    this.f334344g3.e(i10, statusCode, jk.f.f307483a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final synchronized okhttp3.internal.http2.i w0(int i10) {
        return this.f334339c.get(Integer.valueOf(i10));
    }

    @oj.j
    public final void w1(boolean z10) throws IOException {
        E1(this, z10, null, 2, null);
    }

    @NotNull
    public final Map<Integer, okhttp3.internal.http2.i> x0() {
        return this.f334339c;
    }

    public final long y0() {
        return this.H1;
    }
}
