package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.internal.h0;
import kotlinx.coroutines.internal.j0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements j0 {
    @Override // kotlinx.coroutines.internal.j0
    public int a() {
        return h0.f315057j;
    }

    @Override // kotlinx.coroutines.internal.j0
    @NotNull
    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.j0
    @NotNull
    public a3 c(@NotNull List<? extends j0> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw new IllegalStateException("The main looper is not available");
        }
        int i10 = 0 >> 1;
        return new f(i.e(mainLooper, true), null, 2, null);
    }
}
