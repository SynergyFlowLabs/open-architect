package aj;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import io.noties.markwon.core.spans.j;
import io.noties.markwon.u;
import io.noties.markwon.x;
import kotlin.text.b0;

/* JADX INFO: loaded from: classes7.dex */
public class g implements x {
    @Override // io.noties.markwon.x
    @p0
    public Object a(@NonNull io.noties.markwon.g gVar, @NonNull u uVar) {
        if (io.noties.markwon.core.b.a.BULLET == io.noties.markwon.core.b.f297494a.g(uVar)) {
            return new io.noties.markwon.core.spans.b(gVar.h(), io.noties.markwon.core.b.f297495b.g(uVar).intValue());
        }
        return new j(gVar.h(), String.valueOf(io.noties.markwon.core.b.f297496c.g(uVar)) + "." + b0.f313282g);
    }
}
