package io.ktor.network.selector;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSelectableBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableBase.kt\nio/ktor/network/selector/SelectableBase\n+ 2 InterestSuspensionsMap.kt\nio/ktor/network/selector/InterestSuspensionsMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n42#2,2:44\n45#2:47\n1#3:46\n*S KotlinDebug\n*F\n+ 1 SelectableBase.kt\nio/ktor/network/selector/SelectableBase\n*L\n38#1:44,2\n38#1:47\n38#1:46\n*E\n"})
public abstract class i implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f296198c = AtomicIntegerFieldUpdater.newUpdater(i.class, "_interestedOps");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f296199a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f296200b = new c();

    @NotNull
    private volatile /* synthetic */ int _interestedOps = 0;

    @Override // io.ktor.network.selector.h
    public void W3(@NotNull g interest, boolean z10) {
        int i10;
        Intrinsics.checkNotNullParameter(interest, "interest");
        int iQ = interest.q();
        do {
            i10 = this._interestedOps;
        } while (!f296198c.compareAndSet(this, i10, z10 ? i10 | iQ : (~iQ) & i10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f296199a.compareAndSet(false, true)) {
            this._interestedOps = 0;
            c cVarJ9 = j9();
            for (g gVar : g.f296187b.a()) {
                n<Unit> nVarN = cVarJ9.n(gVar);
                if (nVarN != null) {
                    Result.a aVar = Result.Companion;
                    nVarN.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(new b())));
                }
            }
        }
    }

    @Override // io.ktor.network.selector.h
    public boolean isClosed() {
        return this.f296199a.get();
    }

    @Override // io.ktor.network.selector.h
    @NotNull
    public c j9() {
        return this.f296200b;
    }

    @Override // io.ktor.network.selector.h
    public int ya() {
        return this._interestedOps;
    }
}
