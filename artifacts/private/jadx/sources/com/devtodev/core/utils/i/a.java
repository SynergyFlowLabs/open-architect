package com.devtodev.core.utils.i;

import com.devtodev.core.network.CoreAsyncTask;
import com.devtodev.core.network.OnRequestSend;
import com.devtodev.core.network.Request;
import com.devtodev.core.network.Response;
import com.devtodev.core.utils.log.CoreLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f98350a;

    /* JADX INFO: renamed from: com.devtodev.core.utils.i.a$a, reason: collision with other inner class name */
    class C0894a implements OnRequestSend {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f98351a;

        C0894a(a aVar, b bVar) {
            this.f98351a = bVar;
        }

        @Override // com.devtodev.core.network.OnRequestSend
        public void OnSend(Response response) {
            try {
                this.f98351a.a(new JSONObject(response.getResponseMessage()));
            } catch (Exception e10) {
                CoreLog.e("DevToDev", e10.toString());
            }
        }
    }

    public static a a() {
        if (f98350a == null) {
            f98350a = new a();
        }
        return f98350a;
    }

    public void a(b bVar) {
        try {
            Object objInvoke = Class.forName("com.facebook.AccessToken").getMethod("getCurrentAccessToken", null).invoke(null, null);
            String str = (String) objInvoke.getClass().getMethod("getUserId", null).invoke(objInvoke, null);
            new CoreAsyncTask(new C0894a(this, bVar)).execute(new Request("https://graph.facebook.com/v2.7/" + str + "/?access_token=" + ((String) objInvoke.getClass().getMethod("getToken", null).invoke(objInvoke, null))));
        } catch (Exception unused) {
        }
    }
}
