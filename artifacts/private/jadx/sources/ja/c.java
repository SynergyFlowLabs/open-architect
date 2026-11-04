package ja;

import com.planner5d.library.database.model.contest.Contest;
import java.util.List;
import kotlin.coroutines.d;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface c {

    public interface a {
        void d(@NotNull List<com.planner5d.library.activity.fragment.feed.a> list);

        void e(@NotNull List<com.planner5d.library.activity.fragment.feed.a> list);
    }

    void A(@NotNull Contest contest, int i10);

    void G();

    void b(int i10);

    void c(@NotNull a aVar);

    void f(@Nullable com.planner5d.library.activity.fragment.feed.a aVar);

    @NotNull
    p2 j(@NotNull Contest contest, int i10);

    @Nullable
    Object n(@NotNull d<? super Integer> dVar);

    void t(@NotNull Contest contest, int i10);
}
