package io.ktor.network.selector;

import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.n;
import kotlinx.coroutines.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSelectorManagerSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectorManagerSupport.kt\nio/ktor/network/selector/SelectorManagerSupport\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 InterestSuspensionsMap.kt\nio/ktor/network/selector/InterestSuspensionsMap\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n426#2,11:188\n32#3,8:199\n42#3,2:207\n45#3:210\n1#4:209\n1#4:212\n1869#5:211\n1870#5:213\n*S KotlinDebug\n*F\n+ 1 SelectorManagerSupport.kt\nio/ktor/network/selector/SelectorManagerSupport\n*L\n44#1:188,11\n86#1:199,8\n150#1:207,2\n150#1:210\n150#1:209\n161#1:211\n161#1:213\n*E\n"})
public abstract class l implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SelectorProvider f296202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f296203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f296204c;

    public static final class a extends CancellationException {
        public a() {
            super("Closed selector");
        }
    }

    static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f296205a = new b();

        b() {
        }

        public final void c(Throwable th2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    public l() {
        SelectorProvider selectorProviderProvider = SelectorProvider.provider();
        Intrinsics.checkNotNullExpressionValue(selectorProviderProvider, "provider(...)");
        this.f296202a = selectorProviderProvider;
    }

    private final void E(SelectionKey selectionKey, h hVar) {
        selectionKey.attach(hVar);
    }

    private final h m(SelectionKey selectionKey) {
        Object objAttachment = selectionKey.attachment();
        if (objAttachment instanceof h) {
            return (h) objAttachment;
        }
        return null;
    }

    protected final void c(@NotNull Selector selector, @NotNull h selectable) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        try {
            SelectableChannel selectableChannelS = selectable.s();
            SelectionKey selectionKeyKeyFor = selectableChannelS.keyFor(selector);
            int iYa = selectable.ya();
            if (selectionKeyKeyFor == null) {
                if (iYa != 0) {
                    selectableChannelS.register(selector, iYa, selectable);
                }
            } else if (selectionKeyKeyFor.interestOps() != iYa) {
                selectionKeyKeyFor.interestOps(iYa);
            }
            if (iYa != 0) {
                this.f296203b++;
            }
        } catch (Throwable th2) {
            SelectionKey selectionKeyKeyFor2 = selectable.s().keyFor(selector);
            if (selectionKeyKeyFor2 != null) {
                selectionKeyKeyFor2.cancel();
            }
            e(selectable, th2);
        }
    }

    protected final void e(@NotNull h attachment, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        Intrinsics.checkNotNullParameter(cause, "cause");
        c cVarJ9 = attachment.j9();
        for (g gVar : g.f296187b.a()) {
            n<Unit> nVarN = cVarJ9.n(gVar);
            if (nVarN != null) {
                Result.a aVar = Result.Companion;
                nVarN.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(cause)));
            }
        }
    }

    protected final void f(@NotNull Selector selector, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (th2 == null) {
            th2 = new a();
        }
        Set<SelectionKey> setKeys = selector.keys();
        Intrinsics.checkNotNullExpressionValue(setKeys, "keys(...)");
        for (SelectionKey selectionKey : setKeys) {
            try {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
            } catch (CancelledKeyException unused) {
            }
            Object objAttachment = selectionKey.attachment();
            h hVar = objAttachment instanceof h ? (h) objAttachment : null;
            if (hVar != null) {
                e(hVar, th2);
            }
            selectionKey.cancel();
        }
    }

    @Override // io.ktor.network.selector.j
    @Nullable
    public final Object i3(@NotNull h hVar, @NotNull g gVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws IOException {
        int iYa = hVar.ya();
        int iQ = gVar.q();
        if (hVar.isClosed()) {
            m.c();
            throw new a0();
        }
        if ((iYa & iQ) == 0) {
            m.d(iYa, iQ);
            throw new a0();
        }
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        pVar.e0(b.f296205a);
        hVar.j9().j(gVar, pVar);
        if (!pVar.isCancelled()) {
            t(hVar);
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    protected final int j() {
        return this.f296204c;
    }

    protected final int l() {
        return this.f296203b;
    }

    protected final void o(@NotNull SelectionKey key) {
        n<Unit> nVarM;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            int i10 = key.readyOps();
            int iInterestOps = key.interestOps();
            h hVarM = m(key);
            if (hVarM == null) {
                key.cancel();
                this.f296204c++;
                return;
            }
            c cVarJ9 = hVarM.j9();
            int[] iArrB = g.f296187b.b();
            int length = iArrB.length;
            for (int i11 = 0; i11 < length; i11++) {
                if ((iArrB[i11] & i10) != 0 && (nVarM = cVarJ9.m(i11)) != null) {
                    Result.a aVar = Result.Companion;
                    nVarM.resumeWith(Result.m785constructorimpl(Unit.f312394a));
                }
            }
            int i12 = (~i10) & iInterestOps;
            if (i12 != iInterestOps) {
                key.interestOps(i12);
            }
            if (i12 != 0) {
                this.f296203b++;
            }
        } catch (Throwable th2) {
            key.cancel();
            this.f296204c++;
            h hVarM2 = m(key);
            if (hVarM2 != null) {
                e(hVarM2, th2);
                E(key, null);
            }
        }
    }

    protected final void q(@NotNull Set<SelectionKey> selectedKeys, @NotNull Set<? extends SelectionKey> keys) {
        Intrinsics.checkNotNullParameter(selectedKeys, "selectedKeys");
        Intrinsics.checkNotNullParameter(keys, "keys");
        int size = selectedKeys.size();
        this.f296203b = keys.size() - size;
        this.f296204c = 0;
        if (size <= 0) {
            return;
        }
        Iterator<SelectionKey> it = selectedKeys.iterator();
        while (it.hasNext()) {
            o(it.next());
            it.remove();
        }
    }

    protected final void r(@NotNull Selector selector, @NotNull SelectionKey key, @NotNull h attachment) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        e(attachment, new ClosedChannelException());
        E(key, null);
        selector.wakeup();
    }

    protected abstract void t(@NotNull h hVar);

    @Override // io.ktor.network.selector.j
    @NotNull
    public final SelectorProvider u0() {
        return this.f296202a;
    }

    protected final void x(int i10) {
        this.f296204c = i10;
    }

    protected final void y(int i10) {
        this.f296203b = i10;
    }
}
