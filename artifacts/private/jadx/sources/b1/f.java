package b1;

import androidx.compose.animation.core.l3;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.tooling.animation.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTransitionClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/TransitionClock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1#2:91\n1#2:102\n1611#3,9:92\n1863#3:101\n1864#3:103\n1620#3:104\n774#3:105\n865#3,2:106\n1557#3:108\n1628#3,3:109\n774#3:112\n865#3,2:113\n*S KotlinDebug\n*F\n+ 1 TransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/TransitionClock\n*L\n58#1:102\n58#1:92,9\n58#1:101\n58#1:103\n58#1:104\n63#1:105\n63#1:106,2\n78#1:108\n78#1:109,3\n79#1:112\n79#1:113,2\n*E\n"})
public final class f<T> implements c<e0<T>, c1.c<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f77515c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e0<T> f77516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private c1.c<T> f77517b = new c1.c<>(i().d().p(), i().d().y());

    public f(@NotNull e0<T> e0Var) {
        this.f77516a = e0Var;
    }

    @Override // b1.c
    public void a(long j10) {
        i().d().P(getState().e(), getState().f(), j10);
    }

    @Override // b1.c
    public long b() {
        return j.s(i().d().z());
    }

    @Override // b1.c
    @NotNull
    public List<ComposeAnimatedProperty> c() {
        List<l3<?>.d<?, ?>> listD = j.d(i().d());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            l3.d dVar = (l3.d) it.next();
            Object value = dVar.getValue();
            ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new ComposeAnimatedProperty(dVar.p(), value);
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t10 : arrayList) {
            if (!j.q().contains(((ComposeAnimatedProperty) t10).getLabel())) {
                arrayList2.add(t10);
            }
        }
        return arrayList2;
    }

    @Override // b1.c
    @NotNull
    public List<TransitionInfo> d(long j10) {
        List<l3<?>.d<?, ?>> listD = j.d(i().d());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(j.g((l3.d) it.next(), j10));
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t10 : arrayList) {
            if (!j.q().contains(((TransitionInfo) t10).getLabel())) {
                arrayList2.add(t10);
            }
        }
        return arrayList2;
    }

    @Override // b1.c
    public void e(@NotNull Object obj, @Nullable Object obj2) {
        c1.c<T> cVarT = j.t(getState().e(), obj, obj2);
        if (cVarT != null) {
            g(cVarT);
        }
    }

    @Override // b1.c
    public long h() {
        return j.s(i().d().z());
    }

    @Override // b1.c
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e0<T> i() {
        return this.f77516a;
    }

    @Override // b1.c
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c1.c<T> getState() {
        return this.f77517b;
    }

    @Override // b1.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void g(@NotNull c1.c<T> cVar) {
        this.f77517b = cVar;
        a(0L);
    }
}
