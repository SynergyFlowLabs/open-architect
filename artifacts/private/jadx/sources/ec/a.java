package ec;

import androidx.annotation.m1;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nCompositeFileAccessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeFileAccessor.kt\ncom/planner5d/library/engine/rendering/model/managing/CompositeFileAccessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b[] f274753c;

    public a(@NotNull b... accessors) {
        Intrinsics.checkNotNullParameter(accessors, "accessors");
        this.f274753c = accessors;
    }

    @Override // ec.b
    @m1
    @Nullable
    public InputStream a(@Nullable String str) throws Throwable {
        for (b bVar : this.f274753c) {
            InputStream inputStreamA = bVar.a(str);
            if (inputStreamA != null) {
                return inputStreamA;
            }
        }
        return null;
    }
}
