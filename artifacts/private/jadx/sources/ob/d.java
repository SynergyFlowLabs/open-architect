package ob;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<pb.a> f333618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<qb.a> f333619b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull List<pb.a> linesToDraw, @NotNull List<? extends qb.a> itemsToHighlight) {
        Intrinsics.checkNotNullParameter(linesToDraw, "linesToDraw");
        Intrinsics.checkNotNullParameter(itemsToHighlight, "itemsToHighlight");
        this.f333618a = linesToDraw;
        this.f333619b = itemsToHighlight;
    }

    @NotNull
    public final List<qb.a> a() {
        return this.f333619b;
    }

    @NotNull
    public final List<pb.a> b() {
        return this.f333618a;
    }
}
