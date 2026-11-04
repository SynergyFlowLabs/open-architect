package va;

import com.planner5d.library.model.manager.z2;
import java.util.List;
import kotlin.Unit;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface b extends z2 {

    public interface a {

        /* JADX INFO: renamed from: va.b$a$a, reason: collision with other inner class name */
        public static final class C2520a {
            @l(message = "Use json instead")
            public static /* synthetic */ void a() {
            }
        }

        @Nullable
        Boolean a();

        @Nullable
        String getJson();

        @NotNull
        String getText();
    }

    @Nullable
    Object a(long j10, @NotNull kotlin.coroutines.d<? super List<? extends a>> dVar);

    @Nullable
    Object f(long j10, @NotNull a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
