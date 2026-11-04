package c;

import android.content.Context;
import com.google.firebase.remoteconfig.e0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f82330a;

    public a(Context context, String str) {
        HashMap<String, Object> map = new HashMap<>();
        this.f82330a = map;
        map.put(e0.b.f124458s2, com.devtodev.core.utils.a.b(context));
        if (str != null && !str.equals("")) {
            this.f82330a.put("configVersion", str);
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.f82330a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }
}
