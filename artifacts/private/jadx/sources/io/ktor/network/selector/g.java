package io.ktor.network.selector;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSelectorManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectorManager.kt\nio/ktor/network/selector/SelectInterest\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n37#2:95\n36#2,3:96\n1563#3:99\n1634#3,3:100\n*S KotlinDebug\n*F\n+ 1 SelectorManager.kt\nio/ktor/network/selector/SelectInterest\n*L\n87#1:95\n87#1:96,3\n89#1:99\n89#1:100,3\n*E\n"})
public enum g {
    READ(1),
    WRITE(4),
    ACCEPT(16),
    CONNECT(8);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final int[] f296189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f296190e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f296197a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f296196k = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f296187b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final g[] f296188c = (g[]) p().toArray(new g[0]);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final g[] a() {
            return g.f296188c;
        }

        @NotNull
        public final int[] b() {
            return g.f296189d;
        }

        public final int c() {
            return g.f296190e;
        }

        private a() {
        }
    }

    static {
        kotlin.enums.a<g> aVarP = p();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(aVarP, 10));
        Iterator<g> it = aVarP.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().f296197a));
        }
        f296189d = CollectionsKt.toIntArray(arrayList);
        f296190e = p().size();
    }

    g(int i10) {
        this.f296197a = i10;
    }

    @NotNull
    public static kotlin.enums.a<g> p() {
        return f296196k;
    }

    public final int q() {
        return this.f296197a;
    }
}
