package u0;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.v;
import androidx.collection.t1;
import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/ResourceIdCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f381115b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t1<TypedValue> f381116a = new t1<>(0, 1, null);

    public final void a() {
        synchronized (this) {
            this.f381116a.P();
            Unit unit = Unit.f312394a;
        }
    }

    @NotNull
    public final TypedValue b(@NotNull Resources resources, @v int i10) {
        TypedValue typedValueN;
        synchronized (this) {
            typedValueN = this.f381116a.n(i10);
            if (typedValueN == null) {
                typedValueN = new TypedValue();
                resources.getValue(i10, typedValueN, true);
                this.f381116a.c0(i10, typedValueN);
            }
        }
        return typedValueN;
    }
}
