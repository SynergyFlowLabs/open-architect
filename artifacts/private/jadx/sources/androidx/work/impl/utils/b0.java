package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class b0 implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable command) {
        command.run();
    }
}
