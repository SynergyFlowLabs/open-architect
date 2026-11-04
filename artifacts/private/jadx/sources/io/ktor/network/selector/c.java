package io.ktor.network.selector;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.v0;
import kotlin.k0;
import kotlinx.coroutines.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nInterestSuspensionsMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterestSuspensionsMap.kt\nio/ktor/network/selector/InterestSuspensionsMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,79:1\n1#2:80\n11228#3:81\n11563#3,3:82\n37#4:85\n36#4,3:86\n*S KotlinDebug\n*F\n+ 1 InterestSuspensionsMap.kt\nio/ktor/network/selector/InterestSuspensionsMap\n*L\n59#1:81\n59#1:82,3\n71#1:85\n71#1:86,3\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f296157a = new e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final AtomicReferenceFieldUpdater<c, n<Unit>>[] f296158b;

    @Nullable
    private volatile n<? super Unit> acceptHandlerReference;

    @Nullable
    private volatile n<? super Unit> connectHandlerReference;

    @Nullable
    private volatile n<? super Unit> readHandlerReference;

    @Nullable
    private volatile n<? super Unit> writeHandlerReference;

    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AtomicReferenceFieldUpdater<c, n<Unit>> c(g gVar) {
            return c.f296158b[gVar.ordinal()];
        }

        private e() {
        }
    }

    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f296163a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.ACCEPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.CONNECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f296163a = iArr;
        }
    }

    static {
        kotlin.reflect.c cVar;
        g[] gVarArrA = g.f296187b.a();
        ArrayList arrayList = new ArrayList(gVarArrA.length);
        for (g gVar : gVarArrA) {
            int i10 = f.f296163a[gVar.ordinal()];
            if (i10 == 1) {
                cVar = new v0() { // from class: io.ktor.network.selector.c.a
                    @Override // kotlin.jvm.internal.v0, kotlin.reflect.q
                    public Object get(Object obj) {
                        return ((c) obj).readHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.v0, kotlin.reflect.l
                    public void set(Object obj, Object obj2) {
                        ((c) obj).readHandlerReference = (n) obj2;
                    }
                };
            } else if (i10 == 2) {
                cVar = new v0() { // from class: io.ktor.network.selector.c.b
                    @Override // kotlin.jvm.internal.v0, kotlin.reflect.q
                    public Object get(Object obj) {
                        return ((c) obj).writeHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.v0, kotlin.reflect.l
                    public void set(Object obj, Object obj2) {
                        ((c) obj).writeHandlerReference = (n) obj2;
                    }
                };
            } else if (i10 == 3) {
                cVar = new v0() { // from class: io.ktor.network.selector.c.c
                    @Override // kotlin.jvm.internal.v0, kotlin.reflect.q
                    public Object get(Object obj) {
                        return ((c) obj).acceptHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.v0, kotlin.reflect.l
                    public void set(Object obj, Object obj2) {
                        ((c) obj).acceptHandlerReference = (n) obj2;
                    }
                };
            } else {
                if (i10 != 4) {
                    throw new k0();
                }
                cVar = new v0() { // from class: io.ktor.network.selector.c.d
                    @Override // kotlin.jvm.internal.v0, kotlin.reflect.q
                    public Object get(Object obj) {
                        return ((c) obj).connectHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.v0, kotlin.reflect.l
                    public void set(Object obj, Object obj2) {
                        ((c) obj).connectHandlerReference = (n) obj2;
                    }
                };
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(c.class, n.class, cVar.getName());
            Intrinsics.checkNotNull(atomicReferenceFieldUpdaterNewUpdater, "null cannot be cast to non-null type java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.ktor.network.selector.InterestSuspensionsMap, kotlinx.coroutines.CancellableContinuation<kotlin.Unit>?>");
            arrayList.add(atomicReferenceFieldUpdaterNewUpdater);
        }
        f296158b = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    public final void j(@NotNull g interest, @NotNull n<? super Unit> continuation) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        if (androidx.concurrent.futures.b.a(f296157a.c(interest), this, null, continuation)) {
            return;
        }
        throw new IllegalStateException(("Handler for " + interest.name() + " is already registered").toString());
    }

    public final void k(int i10, @NotNull Function1<? super n<? super Unit>, Unit> block) {
        n<Unit> nVarM;
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArrB = g.f296187b.b();
        int length = iArrB.length;
        for (int i11 = 0; i11 < length; i11++) {
            if ((iArrB[i11] & i10) != 0 && (nVarM = m(i11)) != null) {
                block.invoke(nVarM);
            }
        }
    }

    public final void l(@NotNull Function2<? super n<? super Unit>, ? super g, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (g gVar : g.f296187b.a()) {
            n<Unit> nVarN = n(gVar);
            if (nVarN != null) {
                block.invoke(nVarN, gVar);
            }
        }
    }

    @Nullable
    public final n<Unit> m(int i10) {
        return f296158b[i10].getAndSet(this, null);
    }

    @Nullable
    public final n<Unit> n(@NotNull g interest) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        int i10 = 5 << 0;
        return (n) f296157a.c(interest).getAndSet(this, null);
    }

    @NotNull
    public String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }
}
