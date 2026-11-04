package io.ktor.network.selector;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLockFreeMPSCQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeMPSCQueue.kt\nio/ktor/network/selector/LockFreeMPSCQueue\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,244:1\n154#2,2:245\n154#2,2:247\n154#2,2:249\n*S KotlinDebug\n*F\n+ 1 LockFreeMPSCQueue.kt\nio/ktor/network/selector/LockFreeMPSCQueue\n*L\n30#1:245,2\n37#1:247,2\n48#1:249,2\n*E\n"})
public final class d<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f296164a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "curRef");

    @NotNull
    private volatile /* synthetic */ Object curRef = new e(8);

    public final boolean a(@NotNull E element) {
        Intrinsics.checkNotNullParameter(element, "element");
        while (true) {
            e eVar = (e) this.curRef;
            int iA = eVar.a(element);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.b.a(f296164a, this, eVar, eVar.h());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            e eVar = (e) this.curRef;
            if (eVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f296164a, this, eVar, eVar.h());
            }
        }
    }

    public final boolean c() {
        return ((e) this.curRef).f();
    }

    @Nullable
    public final E d() {
        while (true) {
            e eVar = (e) this.curRef;
            E e10 = (E) eVar.i();
            if (e10 != e.f296179r) {
                return e10;
            }
            androidx.concurrent.futures.b.a(f296164a, this, eVar, eVar.h());
        }
    }
}
