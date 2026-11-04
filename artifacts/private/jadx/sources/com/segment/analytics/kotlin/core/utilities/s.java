package com.segment.analytics.kotlin.core.utilities;

import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.v;
import com.segment.analytics.kotlin.core.y;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.n0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nStorageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageImpl.kt\ncom/segment/analytics/kotlin/core/utilities/StorageImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n766#2:238\n857#2,2:239\n*S KotlinDebug\n*F\n+ 1 StorageImpl.kt\ncom/segment/analytics/kotlin/core/utilities/StorageImpl\n*L\n111#1:238\n111#1:239,2\n*E\n"})
public class s implements sovran.kotlin.g, com.segment.analytics.kotlin.core.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f267020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.utilities.f f267021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final sovran.kotlin.e f267022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f267023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f267024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final n0 f267025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.h f267026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f267027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f267028i;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f267029a;

        static {
            int[] iArr = new int[com.segment.analytics.kotlin.core.s.b.values().length];
            try {
                iArr[com.segment.analytics.kotlin.core.s.b.Events.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f267029a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.utilities.StorageImpl", f = "StorageImpl.kt", i = {0}, l = {48, 55}, m = "initialize$suspendImpl", n = {"$this"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f267030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f267031b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f267033d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f267031b = obj;
            this.f267033d |= Integer.MIN_VALUE;
            return s.t(s.this, this);
        }
    }

    /* synthetic */ class c extends g0 implements Function2<y, kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        c(Object obj) {
            super(2, obj, s.class, "userInfoUpdate", "userInfoUpdate(Lcom/segment/analytics/kotlin/core/UserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull y yVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            return ((s) this.receiver).y(yVar, dVar);
        }
    }

    /* synthetic */ class d extends g0 implements Function2<v, kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        d(Object obj) {
            super(2, obj, s.class, "systemUpdate", "systemUpdate(Lcom/segment/analytics/kotlin/core/System;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull v vVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            return ((s) this.receiver).x(vVar, dVar);
        }
    }

    static final class e extends l0 implements Function1<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f267034a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return k.b(it);
        }
    }

    static final class f extends l0 implements Function0<Unit> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            s.this.u();
        }
    }

    static final class g extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f267037b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(0);
            this.f267037b = str;
            int i10 = 6 & 0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            boolean zD = s.this.p().d(s.this.n());
            if (zD) {
                s.this.p().write(s.this.m());
            }
            if (s.this.p().getLength() > 475000) {
                s.this.u();
                zD = s.this.p().d(s.this.n());
                s.this.p().write(s.this.m());
            }
            StringBuilder sb2 = new StringBuilder();
            if (!zD) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(this.f267037b);
            com.segment.analytics.kotlin.core.utilities.f fVarP = s.this.p();
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "contents.toString()");
            fVarP.write(string);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.utilities.StorageImpl", f = "StorageImpl.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160705l0}, m = "systemUpdate", n = {"this"}, s = {"L$0"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f267038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f267039b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f267041d;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f267039b = obj;
            this.f267041d |= Integer.MIN_VALUE;
            return s.this.x(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.utilities.StorageImpl", f = "StorageImpl.kt", i = {0, 0, 1, 1, 2}, l = {65, com.planner5d.library.engine.input.f.b.V, com.planner5d.library.engine.input.f.b.C0}, m = "userInfoUpdate", n = {"this", "userInfo", "this", "userInfo", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f267042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f267043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f267044c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f267046e;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f267044c = obj;
            this.f267046e |= Integer.MIN_VALUE;
            return s.this.y(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.utilities.StorageImpl", f = "StorageImpl.kt", i = {0, 0}, l = {194}, m = "withLock", n = {"this", "block"}, s = {"L$0", "L$1"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f267047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f267048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f267049c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f267051e;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f267049c = obj;
            this.f267051e |= Integer.MIN_VALUE;
            return s.this.z(null, this);
        }
    }

    public s(@NotNull p propertiesFile, @NotNull com.segment.analytics.kotlin.core.utilities.f eventStream, @NotNull sovran.kotlin.e store, @NotNull String writeKey, @NotNull String fileIndexKey, @NotNull n0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(propertiesFile, "propertiesFile");
        Intrinsics.checkNotNullParameter(eventStream, "eventStream");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        Intrinsics.checkNotNullParameter(fileIndexKey, "fileIndexKey");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f267020a = propertiesFile;
        this.f267021b = eventStream;
        this.f267022c = store;
        this.f267023d = writeKey;
        this.f267024e = fileIndexKey;
        this.f267025f = ioDispatcher;
        this.f267026g = kotlinx.coroutines.sync.l.b(1, 0, 2, null);
        this.f267027h = "{\"batch\":[";
        this.f267028i = "tmp";
    }

    static /* synthetic */ Object A(s sVar, com.segment.analytics.kotlin.core.s.b bVar, String str, kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        if (a.f267029a[bVar.ordinal()] != 1) {
            sVar.c(bVar, str);
            return Unit.f312394a;
        }
        if (str.length() >= 32000) {
            throw new Exception("enqueued payload is too large");
        }
        Object objW = sVar.w(str, dVar);
        return objW == kotlin.coroutines.intrinsics.b.l() ? objW : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        return this.f267023d + org.apache.commons.codec.language.l.f335457d + this.f267020a.c(this.f267024e, 0) + '.' + this.f267028i;
    }

    private final void s() {
        this.f267020a.d(this.f267024e, this.f267020a.c(this.f267024e, 0) + 1);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        if (r1.r(r2, r3, true, r5, r6, r7) == r0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object t(com.segment.analytics.kotlin.core.utilities.s r10, kotlin.coroutines.d<? super kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof com.segment.analytics.kotlin.core.utilities.s.b
            if (r0 == 0) goto L18
            r0 = r11
            r0 = r11
            r9 = 4
            com.segment.analytics.kotlin.core.utilities.s$b r0 = (com.segment.analytics.kotlin.core.utilities.s.b) r0
            int r1 = r0.f267033d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r9 = 4
            r0.f267033d = r1
        L15:
            r7 = r0
            r7 = r0
            goto L1f
        L18:
            com.segment.analytics.kotlin.core.utilities.s$b r0 = new com.segment.analytics.kotlin.core.utilities.s$b
            r9 = 4
            r0.<init>(r11)
            goto L15
        L1f:
            java.lang.Object r11 = r7.f267031b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r7.f267033d
            r8 = 2
            r9 = 4
            r2 = 1
            r9 = 0
            if (r1 == 0) goto L4a
            if (r1 == r2) goto L3f
            if (r1 != r8) goto L37
            r9 = 0
            kotlin.ResultKt.m(r11)
            r9 = 4
            goto L8f
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            r9 = 5
            java.lang.Object r10 = r7.f267030a
            r9 = 0
            com.segment.analytics.kotlin.core.utilities.s r10 = (com.segment.analytics.kotlin.core.utilities.s) r10
            kotlin.ResultKt.m(r11)
            r2 = r10
            goto L6d
        L4a:
            kotlin.ResultKt.m(r11)
            sovran.kotlin.e r1 = r10.f267022c
            com.segment.analytics.kotlin.core.utilities.s$c r6 = new com.segment.analytics.kotlin.core.utilities.s$c
            r6.<init>(r10)
            r9 = 7
            kotlinx.coroutines.n0 r5 = r10.f267025f
            java.lang.Class<com.segment.analytics.kotlin.core.y> r11 = com.segment.analytics.kotlin.core.y.class
            kotlin.reflect.d r3 = kotlin.jvm.internal.j1.d(r11)
            r7.f267030a = r10
            r7.f267033d = r2
            r9 = 7
            r4 = 1
            r2 = r10
            r9 = 5
            java.lang.Object r10 = r1.r(r2, r3, r4, r5, r6, r7)
            r9 = 4
            if (r10 != r0) goto L6d
            goto L8e
        L6d:
            r9 = 1
            sovran.kotlin.e r1 = r2.f267022c
            com.segment.analytics.kotlin.core.utilities.s$d r6 = new com.segment.analytics.kotlin.core.utilities.s$d
            r6.<init>(r2)
            kotlinx.coroutines.n0 r5 = r2.f267025f
            r9 = 0
            java.lang.Class<com.segment.analytics.kotlin.core.v> r10 = com.segment.analytics.kotlin.core.v.class
            r9 = 3
            kotlin.reflect.d r3 = kotlin.jvm.internal.j1.d(r10)
            r9 = 7
            r10 = 0
            r7.f267030a = r10
            r7.f267033d = r8
            r9 = 5
            r4 = 1
            java.lang.Object r10 = r1.r(r2, r3, r4, r5, r6, r7)
            r9 = 5
            if (r10 != r0) goto L8f
        L8e:
            return r0
        L8f:
            r9 = 5
            kotlin.Unit r10 = kotlin.Unit.f312394a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.utilities.s.t(com.segment.analytics.kotlin.core.utilities.s, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        if (this.f267021b.c()) {
            this.f267021b.write(o());
            this.f267021b.a(e.f267034a);
            s();
        }
    }

    static /* synthetic */ Object v(s sVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object objZ = sVar.z(sVar.new f(), dVar);
        return objZ == kotlin.coroutines.intrinsics.b.l() ? objZ : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(String str, kotlin.coroutines.d<? super Unit> dVar) {
        Object objZ = z(new g(str), dVar);
        return objZ == kotlin.coroutines.intrinsics.b.l() ? objZ : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object z(Function0<Unit> function0, kotlin.coroutines.d<? super Unit> dVar) {
        j jVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f267051e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f267051e = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object obj = jVar.f267049c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = jVar.f267051e;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlinx.coroutines.sync.h hVar = this.f267026g;
            jVar.f267047a = this;
            jVar.f267048b = function0;
            jVar.f267051e = 1;
            if (hVar.g(jVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) jVar.f267048b;
            this = (s) jVar.f267047a;
            ResultKt.m(obj);
        }
        function0.invoke();
        this.f267026g.release();
        return Unit.f312394a;
    }

    @Override // com.segment.analytics.kotlin.core.s
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return t(this, dVar);
    }

    @Override // com.segment.analytics.kotlin.core.s
    @Nullable
    public InputStream b(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return this.f267021b.b(source);
    }

    @Override // com.segment.analytics.kotlin.core.s
    public void c(@NotNull com.segment.analytics.kotlin.core.s.b key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f267020a.a(key.l(), value);
    }

    @Override // com.segment.analytics.kotlin.core.s
    @Nullable
    public String d(@NotNull com.segment.analytics.kotlin.core.s.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (a.f267029a[key.ordinal()] != 1) {
            return this.f267020a.b(key.l(), null);
        }
        List<String> list = this.f267021b.read();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt.M1((String) obj, '.' + this.f267028i, false, 2, null)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null);
    }

    @Override // com.segment.analytics.kotlin.core.s
    @Nullable
    public Object e(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return v(this, dVar);
    }

    @Override // com.segment.analytics.kotlin.core.s
    @Nullable
    public Object f(@NotNull com.segment.analytics.kotlin.core.s.b bVar, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return A(this, bVar, str, dVar);
    }

    @Override // com.segment.analytics.kotlin.core.s
    public boolean g(@NotNull com.segment.analytics.kotlin.core.s.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (a.f267029a[key.ordinal()] != 1) {
            this.f267020a.remove(key.l());
        }
        return true;
    }

    @Override // com.segment.analytics.kotlin.core.s
    public boolean h(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        try {
            this.f267021b.remove(filePath);
            return true;
        } catch (Exception e10) {
            com.segment.analytics.kotlin.core.k.c(com.segment.analytics.kotlin.core.a.Companion, e10);
            return false;
        }
    }

    @NotNull
    public final String m() {
        return this.f267027h;
    }

    @NotNull
    public final String o() {
        return "],\"sentAt\":\"" + r.Companion.b() + "\",\"writeKey\":\"" + this.f267023d + "\"}";
    }

    @NotNull
    public final com.segment.analytics.kotlin.core.utilities.f p() {
        return this.f267021b;
    }

    @NotNull
    public final String q() {
        return this.f267024e;
    }

    @NotNull
    public final p r() {
        return this.f267020a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object x(@NotNull v vVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        h hVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f267041d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f267041d = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object obj = hVar.f267039b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar.f267041d;
        if (i11 == 0) {
            ResultKt.m(obj);
            Settings settingsL = vVar.l();
            if (settingsL != null) {
                com.segment.analytics.kotlin.core.s.b bVar = com.segment.analytics.kotlin.core.s.b.Settings;
                String strEncodeToString = Json.Default.encodeToString(Settings.Companion.serializer(), settingsL);
                hVar.f267038a = this;
                hVar.f267041d = 1;
                if (f(bVar, strEncodeToString, hVar) == objL) {
                    return objL;
                }
            } else {
                kotlin.coroutines.jvm.internal.b.a(g(com.segment.analytics.kotlin.core.s.b.Settings));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        if (r8.f(r10, r9, r0) == r1) goto L35;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(@org.jetbrains.annotations.NotNull com.segment.analytics.kotlin.core.y r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.utilities.s.y(com.segment.analytics.kotlin.core.y, kotlin.coroutines.d):java.lang.Object");
    }
}
