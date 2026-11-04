package androidx.datastore.core;

import android.os.FileObserver;
import androidx.annotation.l1;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.o1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nMulticastFileObserver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1855#2,2:146\n*S KotlinDebug\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver\n*L\n50#1:146,2\n*E\n"})
public final class e0 extends FileObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f49493c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Object f49494d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Map<String, e0> f49495e = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f49496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<Function1<String, Unit>> f49497b;

    @SourceDebugExtension({"SMAP\nMulticastFileObserver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n372#2,7:146\n1855#3,2:153\n*S KotlinDebug\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver$Companion\n*L\n103#1:146,7\n137#1:153,2\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: androidx.datastore.core.e0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.B0, 85}, m = "invokeSuspend", n = {"$this$channelFlow", "disposeListener"}, s = {"L$0", "L$1"})
        static final class C0429a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.l0<? super Unit>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f49498a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f49499b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f49500c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ File f49501d;

            /* JADX INFO: renamed from: androidx.datastore.core.e0$a$a$a, reason: collision with other inner class name */
            static final class C0430a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ o1 f49502a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0430a(o1 o1Var) {
                    super(0);
                    this.f49502a = o1Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f312394a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f49502a.dispose();
                }
            }

            /* JADX INFO: renamed from: androidx.datastore.core.e0$a$a$b */
            static final class b extends kotlin.jvm.internal.l0 implements Function1<String, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ File f49503a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.l0<Unit> f49504b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(File file, kotlinx.coroutines.channels.l0<? super Unit> l0Var) {
                    super(1);
                    this.f49503a = file;
                    this.f49504b = l0Var;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.f312394a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable String str) {
                    if (Intrinsics.areEqual(str, this.f49503a.getName())) {
                        kotlinx.coroutines.channels.v.m0(this.f49504b, Unit.f312394a);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0429a(File file, kotlin.coroutines.d<? super C0429a> dVar) {
                super(2, dVar);
                this.f49501d = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                C0429a c0429a = new C0429a(this.f49501d, dVar);
                c0429a.f49500c = obj;
                return c0429a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
            
                if (kotlinx.coroutines.channels.j0.b(r3, r8, r7) == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r6 = 1
                    int r1 = r7.f49499b
                    r2 = 1
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2b
                    if (r1 == r3) goto L1d
                    if (r1 != r2) goto L14
                    kotlin.ResultKt.m(r8)
                    goto L79
                L14:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    r6 = 1
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L1d:
                    java.lang.Object r1 = r7.f49498a
                    r6 = 0
                    kotlinx.coroutines.o1 r1 = (kotlinx.coroutines.o1) r1
                    java.lang.Object r3 = r7.f49500c
                    r6 = 7
                    kotlinx.coroutines.channels.l0 r3 = (kotlinx.coroutines.channels.l0) r3
                    kotlin.ResultKt.m(r8)
                    goto L61
                L2b:
                    kotlin.ResultKt.m(r8)
                    r6 = 0
                    java.lang.Object r8 = r7.f49500c
                    kotlinx.coroutines.channels.l0 r8 = (kotlinx.coroutines.channels.l0) r8
                    androidx.datastore.core.e0$a$a$b r1 = new androidx.datastore.core.e0$a$a$b
                    r6 = 1
                    java.io.File r4 = r7.f49501d
                    r6 = 2
                    r1.<init>(r4, r8)
                    r6 = 4
                    androidx.datastore.core.e0$a r4 = androidx.datastore.core.e0.f49493c
                    java.io.File r5 = r7.f49501d
                    java.io.File r5 = r5.getParentFile()
                    r6 = 6
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                    r6 = 2
                    kotlinx.coroutines.o1 r1 = androidx.datastore.core.e0.a.b(r4, r5, r1)
                    r6 = 0
                    kotlin.Unit r4 = kotlin.Unit.f312394a
                    r6 = 6
                    r7.f49500c = r8
                    r7.f49498a = r1
                    r7.f49499b = r3
                    java.lang.Object r3 = r8.G(r4, r7)
                    if (r3 != r0) goto L60
                    r6 = 6
                    goto L78
                L60:
                    r3 = r8
                L61:
                    r6 = 4
                    androidx.datastore.core.e0$a$a$a r8 = new androidx.datastore.core.e0$a$a$a
                    r8.<init>(r1)
                    r1 = 0
                    r6 = r1
                    r7.f49500c = r1
                    r7.f49498a = r1
                    r6 = 5
                    r7.f49499b = r2
                    r6 = 3
                    java.lang.Object r7 = kotlinx.coroutines.channels.j0.b(r3, r8, r7)
                    r6 = 0
                    if (r7 != r0) goto L79
                L78:
                    return r0
                L79:
                    r6 = 6
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.e0.a.C0429a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.channels.l0<? super Unit> l0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0429a) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @l1
        public static /* synthetic */ void d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @androidx.annotation.j
        public final o1 e(File file, final Function1<? super String, Unit> function1) {
            final String key = file.getCanonicalFile().getPath();
            synchronized (e0.f49494d) {
                try {
                    Map<String, e0> mapC = e0.f49493c.c();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    e0 e0Var = mapC.get(key);
                    if (e0Var == null) {
                        e0Var = new e0(key, null);
                        mapC.put(key, e0Var);
                    }
                    e0 e0Var2 = e0Var;
                    e0Var2.f49497b.add(function1);
                    if (e0Var2.f49497b.size() == 1) {
                        e0Var2.startWatching();
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new o1() { // from class: androidx.datastore.core.d0
                @Override // kotlinx.coroutines.o1
                public final void dispose() {
                    e0.a.g(key, function1);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(String str, Function1 observer) {
            Intrinsics.checkNotNullParameter(observer, "$observer");
            synchronized (e0.f49494d) {
                try {
                    a aVar = e0.f49493c;
                    e0 e0Var = aVar.c().get(str);
                    if (e0Var != null) {
                        e0Var.f49497b.remove(observer);
                        if (e0Var.f49497b.isEmpty()) {
                            aVar.c().remove(str);
                            e0Var.stopWatching();
                        }
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @NotNull
        public final Map<String, e0> c() {
            return e0.f49495e;
        }

        @androidx.annotation.j
        @NotNull
        public final kotlinx.coroutines.flow.i<Unit> f(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return kotlinx.coroutines.flow.k.x(new C0429a(file, null));
        }

        @l1
        public final void h() {
            synchronized (e0.f49494d) {
                try {
                    Iterator<T> it = e0.f49493c.c().values().iterator();
                    while (it.hasNext()) {
                        ((e0) it.next()).stopWatching();
                    }
                    e0.f49493c.c().clear();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private a() {
        }
    }

    public /* synthetic */ e0(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String d() {
        return this.f49496a;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i10, @Nullable String str) {
        Iterator<T> it = this.f49497b.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(str);
        }
    }

    private e0(String str) {
        super(str, 128);
        this.f49496a = str;
        this.f49497b = new CopyOnWriteArrayList<>();
    }
}
