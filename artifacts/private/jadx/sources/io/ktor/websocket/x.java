package io.ktor.websocket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nWebSocketDeflateExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketDeflateExtension.kt\nio/ktor/websocket/WebSocketDeflateExtension\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,256:1\n1#2:257\n21#3:258\n65#4,18:259\n*S KotlinDebug\n*F\n+ 1 WebSocketDeflateExtension.kt\nio/ktor/websocket/WebSocketDeflateExtension\n*L\n245#1:258\n245#1:259,18\n*E\n"})
public final class x implements e0<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f297470i = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<x> f297471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f297472k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final boolean f297473l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final boolean f297474m = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f297475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0<b, ? extends e0<b>> f297476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<h0> f297477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Inflater f297478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Deflater f297479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f297480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f297481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f297482h;

    public static final class a implements f0<b, x> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // io.ktor.websocket.f0
        public boolean a() {
            return x.f297474m;
        }

        @Override // io.ktor.websocket.f0
        public boolean c() {
            return x.f297472k;
        }

        @Override // io.ktor.websocket.f0
        public boolean d() {
            return x.f297473l;
        }

        @Override // io.ktor.websocket.f0
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public x b(@NotNull Function1<? super b, Unit> config) {
            Intrinsics.checkNotNullParameter(config, "config");
            b bVar = new b();
            config.invoke(bVar);
            return new x(bVar);
        }

        @Override // io.ktor.websocket.f0
        @NotNull
        public io.ktor.util.a<x> getKey() {
            return x.f297471j;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f297483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f297484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f297485c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private Function1<? super List<h0>, Unit> f297486d = new Function1() { // from class: io.ktor.websocket.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x.b.s((List) obj);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private Function1<? super e, Boolean> f297487e = new Function1() { // from class: io.ktor.websocket.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.b.g((e) obj));
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(e it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean i(Function1 function1, Function1 function2, e it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ((Boolean) function1.invoke(it)).booleanValue() && ((Boolean) function2.invoke(it)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean k(int i10, e frame) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            return frame.d().length > i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(Function1 function1, Function1 function2, List it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(it);
            function2.invoke(it);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(List it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f312394a;
        }

        @NotNull
        public final List<h0> f() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f297483a) {
                arrayList2.add("client_no_context_takeover");
            }
            if (this.f297484b) {
                arrayList2.add("server_no_context_takeover");
            }
            arrayList.add(new h0("permessage-deflate", arrayList2));
            this.f297486d.invoke(arrayList);
            return arrayList;
        }

        public final void h(@NotNull final Function1<? super e, Boolean> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            final Function1<? super e, Boolean> function1 = this.f297487e;
            this.f297487e = new Function1() { // from class: io.ktor.websocket.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(x.b.i(block, function1, (e) obj));
                }
            };
        }

        public final void j(final int i10) {
            h(new Function1() { // from class: io.ktor.websocket.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(x.b.k(i10, (e) obj));
                }
            });
        }

        public final void l(@NotNull final Function1<? super List<h0>, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            final Function1<? super List<h0>, Unit> function1 = this.f297486d;
            this.f297486d = new Function1() { // from class: io.ktor.websocket.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x.b.m(function1, block, (List) obj);
                }
            };
        }

        public final boolean n() {
            return this.f297483a;
        }

        @NotNull
        public final Function1<e, Boolean> o() {
            return this.f297487e;
        }

        public final int p() {
            return this.f297485c;
        }

        @NotNull
        public final Function1<List<h0>, Unit> q() {
            return this.f297486d;
        }

        public final boolean r() {
            return this.f297484b;
        }

        public final void t(boolean z10) {
            this.f297483a = z10;
        }

        public final void u(@NotNull Function1<? super e, Boolean> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.f297487e = function1;
        }

        public final void v(int i10) {
            this.f297485c = i10;
        }

        public final void w(@NotNull Function1<? super List<h0>, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.f297486d = function1;
        }

        public final void x(boolean z10) {
            this.f297484b = z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.s sVarA = null;
        kotlin.reflect.d dVarD = j1.d(x.class);
        try {
            sVarA = j1.A(x.class);
        } catch (Throwable unused) {
        }
        f297471j = new io.ktor.util.a<>("WebsocketDeflateExtension", new ri.b(dVarD, sVarA));
        f297472k = true;
    }

    public x(@NotNull b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f297475a = config;
        this.f297476b = f297470i;
        this.f297477c = config.f();
        this.f297478d = new Inflater(true);
        this.f297479e = new Deflater(config.p(), true);
    }

    @Override // io.ktor.websocket.e0
    @NotNull
    public f0<b, ? extends e0<b>> a() {
        return this.f297476b;
    }

    @Override // io.ktor.websocket.e0
    @NotNull
    public List<h0> b() {
        return this.f297477c;
    }

    @Override // io.ktor.websocket.e0
    @NotNull
    public e c(@NotNull e frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (((frame instanceof e.f) || (frame instanceof e.a)) && this.f297475a.o().invoke(frame).booleanValue()) {
            byte[] bArrA = zi.b.a(this.f297479e, frame.d());
            if (this.f297480f) {
                this.f297479e.reset();
            }
            return e.f297265i.a(frame.f(), frame.g(), bArrA, f297472k, frame.i(), frame.j());
        }
        return frame;
    }

    @Override // io.ktor.websocket.e0
    @NotNull
    public e d(@NotNull e frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (!d0.b(frame) && !this.f297482h) {
            return frame;
        }
        this.f297482h = true;
        byte[] bArrC = zi.b.c(this.f297478d, frame.d());
        if (this.f297481g) {
            this.f297478d.reset();
        }
        if (frame.f()) {
            this.f297482h = false;
        }
        return e.f297265i.a(frame.f(), frame.g(), bArrC, !f297472k, frame.i(), frame.j());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.ktor.websocket.e0
    @NotNull
    public List<h0> e(@NotNull List<h0> requestedProtocols) {
        Object next;
        Intrinsics.checkNotNullParameter(requestedProtocols, "requestedProtocols");
        Iterator<T> it = requestedProtocols.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((h0) next).b(), "permessage-deflate"));
        h0 h0Var = (h0) next;
        if (h0Var == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, String> pair : h0Var.e()) {
            String strComponent1 = pair.component1();
            String strComponent2 = pair.component2();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = strComponent1.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case -708713803:
                    if (!lowerCase.equals("client_no_context_takeover")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + strComponent1 + ", " + strComponent2 + ')').toString());
                    }
                    if (!StringsKt.w3(strComponent2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    this.f297481g = true;
                    arrayList.add("client_no_context_takeover");
                    break;
                    break;
                case 646404390:
                    if (!lowerCase.equals("client_max_window_bits")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + strComponent1 + ", " + strComponent2 + ')').toString());
                    }
                    break;
                    break;
                case 1266201133:
                    if (!lowerCase.equals("server_no_context_takeover")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + strComponent1 + ", " + strComponent2 + ')').toString());
                    }
                    if (!StringsKt.w3(strComponent2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    this.f297480f = true;
                    arrayList.add("server_no_context_takeover");
                    break;
                    break;
                case 2034279582:
                    if (!lowerCase.equals("server_max_window_bits")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + strComponent1 + ", " + strComponent2 + ')').toString());
                    }
                    if (Integer.parseInt(strComponent2) != 15) {
                        throw new IllegalStateException("Only 15 window size is supported");
                    }
                    break;
                    break;
                default:
                    throw new IllegalStateException(("Unsupported extension parameter: (" + strComponent1 + ", " + strComponent2 + ')').toString());
            }
        }
        return CollectionsKt.listOf(new h0("permessage-deflate", arrayList));
    }

    @Override // io.ktor.websocket.e0
    public boolean f(@NotNull List<h0> negotiatedProtocols) {
        Object next;
        Intrinsics.checkNotNullParameter(negotiatedProtocols, "negotiatedProtocols");
        Iterator<T> it = negotiatedProtocols.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((h0) next).b(), "permessage-deflate"));
        h0 h0Var = (h0) next;
        if (h0Var == null) {
            return false;
        }
        this.f297481g = this.f297475a.r();
        this.f297480f = this.f297475a.n();
        for (Pair<String, String> pair : h0Var.e()) {
            String strComponent1 = pair.component1();
            String strComponent2 = pair.component2();
            switch (strComponent1.hashCode()) {
                case -708713803:
                    if (strComponent1.equals("client_no_context_takeover")) {
                        if (!StringsKt.w3(strComponent2)) {
                            throw new IllegalStateException(("WebSocket permessage-deflate extension parameter client_no_context_takeover shouldn't have a value. Current: " + strComponent2).toString());
                        }
                        this.f297480f = true;
                    }
                    break;
                case 646404390:
                    if (strComponent1.equals("client_max_window_bits") && !StringsKt.w3(strComponent2) && Integer.parseInt(strComponent2) != 15) {
                        throw new IllegalStateException("Only 15 window size is supported.");
                    }
                    break;
                case 1266201133:
                    if (strComponent1.equals("server_no_context_takeover")) {
                        if (!StringsKt.w3(strComponent2)) {
                            throw new IllegalStateException(("WebSocket permessage-deflate extension parameter server_no_context_takeover shouldn't have a value. Current: " + strComponent2).toString());
                        }
                        this.f297481g = true;
                    } else {
                        continue;
                    }
                    break;
                case 2034279582:
                    strComponent1.equals("server_max_window_bits");
                    break;
            }
        }
        return true;
    }

    public final boolean k() {
        return this.f297481g;
    }

    public final boolean l() {
        return this.f297480f;
    }

    public final void m(boolean z10) {
        this.f297481g = z10;
    }

    public final void n(boolean z10) {
        this.f297480f = z10;
    }
}
