package androidx.window.embedding;

import android.app.Activity;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Activity> f76297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f76298b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull List<? extends Activity> activities, boolean z10) {
        Intrinsics.checkNotNullParameter(activities, "activities");
        this.f76297a = activities;
        this.f76298b = z10;
    }

    public final boolean a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.f76297a.contains(activity);
    }

    @NotNull
    public final List<Activity> b() {
        return this.f76297a;
    }

    public final boolean c() {
        return this.f76298b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return (Intrinsics.areEqual(this.f76297a, cVar.f76297a) || this.f76298b == cVar.f76298b) ? false : true;
    }

    public int hashCode() {
        return ((this.f76298b ? 1 : 0) * 31) + this.f76297a.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActivityStack{");
        sb2.append(Intrinsics.stringPlus("activities=", b()));
        sb2.append("isEmpty=" + this.f76298b + AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ c(List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }
}
