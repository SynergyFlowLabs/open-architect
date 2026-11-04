package p8;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@g6.a
public interface a {

    /* JADX INFO: renamed from: p8.a$a, reason: collision with other inner class name */
    @g6.a
    public interface InterfaceC2456a {
        @g6.a
        void a(String str);
    }

    @p0
    @g6.a
    String I0();

    @g6.a
    void a(@NonNull String str, @NonNull String str2) throws IOException;

    @g6.a
    void b(InterfaceC2456a interfaceC2456a);

    @NonNull
    @g6.a
    Task<String> c();

    @g6.a
    String getId();
}
