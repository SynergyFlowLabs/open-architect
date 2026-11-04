package kb;

import com.planner5d.library.database.model.SynchronizedModel;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface b<T extends SynchronizedModel> {
    void c(@NotNull T t10, @NotNull T t11);

    void d(@NotNull id.a aVar, @NotNull T t10, @NotNull JSONObject jSONObject) throws JSONException;

    @NotNull
    List<T> k(@NotNull id.a aVar);

    void l(@NotNull id.a aVar, @NotNull JSONObject jSONObject);

    void p(@NotNull T t10, @NotNull JSONObject jSONObject) throws JSONException;

    @NotNull
    JSONObject w(@NotNull id.a aVar, @NotNull T t10) throws JSONException;
}
