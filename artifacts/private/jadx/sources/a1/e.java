package a1;

import android.graphics.Paint;
import androidx.compose.ui.graphics.u3;
import androidx.compose.ui.graphics.v3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    @NotNull
    public static final Paint.Cap a(int i10) {
        u3.a aVar = u3.f38256b;
        if (u3.g(i10, aVar.a())) {
            return Paint.Cap.BUTT;
        }
        if (u3.g(i10, aVar.b())) {
            return Paint.Cap.ROUND;
        }
        return u3.g(i10, aVar.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    @NotNull
    public static final Paint.Join b(int i10) {
        v3.a aVar = v3.f38275b;
        if (v3.g(i10, aVar.b())) {
            return Paint.Join.MITER;
        }
        if (v3.g(i10, aVar.c())) {
            return Paint.Join.ROUND;
        }
        return v3.g(i10, aVar.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
