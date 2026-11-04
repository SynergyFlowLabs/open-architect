package com.devtodev.core.logic;

import android.content.Context;
import android.os.Handler;
import com.devtodev.core.data.consts.NetworkConsts;
import com.devtodev.core.data.consts.RequestParams;
import com.devtodev.core.network.CoreAsyncTask;
import com.devtodev.core.network.OnRequestSend;
import com.devtodev.core.network.Request;
import com.devtodev.core.network.Response;
import com.devtodev.core.utils.DeviceUtils;
import com.devtodev.core.utils.IOUtils;
import com.devtodev.core.utils.f;
import com.devtodev.core.utils.g;
import com.devtodev.core.utils.log.CoreLog;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f98264a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f98265b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f98266c = "";

    /* JADX INFO: renamed from: com.devtodev.core.logic.a$a, reason: collision with other inner class name */
    static class C0893a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f98267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.devtodev.core.network.a f98268b;

        C0893a(Context context, com.devtodev.core.network.a aVar) {
            this.f98267a = context;
            this.f98268b = aVar;
        }

        @Override // com.devtodev.core.utils.f
        public void a(String str, boolean z10) {
            a.c(this.f98267a, this.f98268b);
        }
    }

    static class b implements OnRequestSend {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkStorage f98269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.devtodev.core.network.a f98270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f98271c;

        b(NetworkStorage networkStorage, com.devtodev.core.network.a aVar, Context context) {
            this.f98269a = networkStorage;
            this.f98270b = aVar;
            this.f98271c = context;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00ab A[PHI: r10
          0x00ab: PHI (r10v4 com.devtodev.core.logic.NetworkStorage) = (r10v3 com.devtodev.core.logic.NetworkStorage), (r10v6 com.devtodev.core.logic.NetworkStorage) binds: [B:30:0x009d, B:32:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.devtodev.core.network.OnRequestSend
        public void OnSend(Response response) {
            NetworkStorage networkStorage;
            NetworkStorage networkStorage2;
            NetworkStorage networkStorage3 = null;
            try {
                String responseMessage = response.getResponseMessage();
                if (responseMessage == null || responseMessage.equals("")) {
                    networkStorage = networkStorage3;
                } else {
                    JSONObject jSONObject = new JSONObject(response.getResponseMessage());
                    int iOptInt = jSONObject.optInt("result", -1);
                    String strOptString = jSONObject.optString("worker");
                    int iOptInt2 = jSONObject.optInt("timeForRequest");
                    int iOptInt3 = jSONObject.optInt("countForRequest");
                    int iOptInt4 = jSONObject.optInt("eventParamsCount");
                    if (iOptInt >= 0) {
                        if (iOptInt == 0) {
                            networkStorage3 = this.f98269a;
                        } else if (iOptInt == 1) {
                            networkStorage3 = new NetworkStorage(jSONObject);
                        } else if (iOptInt == 2 && (networkStorage3 = this.f98269a) != null) {
                            networkStorage3.b();
                            networkStorage3.a();
                        }
                        if (networkStorage3 == null) {
                            networkStorage3 = new NetworkStorage();
                        }
                        networkStorage3.a(strOptString);
                        networkStorage3.c(iOptInt2);
                        networkStorage3.b(iOptInt3);
                        networkStorage3.a(iOptInt4);
                        networkStorage3.a(jSONObject.optBoolean("useCustomUDID", false));
                        networkStorage = networkStorage3;
                    } else {
                        networkStorage = new NetworkStorage(jSONObject);
                    }
                }
            } catch (JSONException e10) {
                CoreLog.e("DevToDev", "", e10);
            }
            if (networkStorage == null) {
                networkStorage = new NetworkStorage();
                networkStorage2 = this.f98269a;
                if (networkStorage2 == null) {
                    networkStorage2 = networkStorage;
                }
            } else {
                networkStorage2 = networkStorage;
            }
            com.devtodev.core.network.a aVar = this.f98270b;
            if (aVar != null) {
                a.b(this.f98271c, aVar, networkStorage2);
            }
        }
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.devtodev.core.network.a f98272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NetworkStorage f98273b;

        c(com.devtodev.core.network.a aVar, NetworkStorage networkStorage) {
            this.f98272a = aVar;
            this.f98273b = networkStorage;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f98272a.a(this.f98273b);
        }
    }

    static class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkStorage f98274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f98275b;

        d(NetworkStorage networkStorage, ArrayList arrayList) {
            this.f98274a = networkStorage;
            this.f98275b = arrayList;
        }

        @Override // com.devtodev.core.utils.g
        public void a(String str, String str2) {
            com.devtodev.core.utils.j.a aVar = new com.devtodev.core.utils.j.a();
            aVar.a(str);
            aVar.b(str2);
            aVar.a(this.f98274a);
            aVar.a(this.f98275b);
            aVar.f();
            aVar.e();
            a.b(aVar);
        }
    }

    static class e implements OnRequestSend {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.devtodev.core.utils.j.a f98276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MetricsStorage f98277b;

        e(com.devtodev.core.utils.j.a aVar, MetricsStorage metricsStorage) {
            this.f98276a = aVar;
            this.f98277b = metricsStorage;
        }

        @Override // com.devtodev.core.network.OnRequestSend
        public void OnSend(Response response) {
            if (response.getResponseCode() == 200) {
                CoreLog.i("DevToDev", "Metric storage has been send successfully");
                a.b(this.f98276a);
            } else {
                ArrayList<MetricsStorage> arrayListC = this.f98276a.c();
                arrayListC.add(0, this.f98277b);
                a.b(arrayListC);
            }
        }
    }

    static void b(Context context, com.devtodev.core.network.a aVar) {
        DeviceUtils.getAdvertiserID(context, new C0893a(context, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, com.devtodev.core.network.a aVar) {
        NetworkStorage networkStorage = (NetworkStorage) IOUtils.loadStorage(context, NetworkStorage.class, NetworkStorage.NAME, true);
        Request request = new Request(a());
        request.addParameter(RequestParams.F, NetworkConsts.NODE_FUCTION);
        request.addParameter("id", SDKClient.getInstance().getApplicationKey());
        request.setNeedSigned(true);
        request.setPostData(new c.a(context, networkStorage != null ? networkStorage.d() : null).a().toString().getBytes());
        new CoreAsyncTask(new b(networkStorage, aVar, context)).execute(request);
    }

    static void b(String str) {
        f98265b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, com.devtodev.core.network.a aVar, NetworkStorage networkStorage) {
        new Handler(context.getMainLooper()).post(new c(aVar, networkStorage));
    }

    static void a(String str) {
        f98266c = str;
    }

    public static String a() {
        String str = f98265b;
        String str2 = (str == null || str.length() == 0) ? NetworkConsts.MAIN_SERVER : f98265b;
        String str3 = f98266c;
        if (str3 == null) {
            str3 = "";
        }
        return str2 + str3 + NetworkConsts.WEB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.devtodev.core.utils.j.a aVar) {
        MetricsStorage metricsStorageG = aVar.g();
        NetworkStorage networkStorageD = aVar.d();
        if (metricsStorageG != null) {
            boolean zG = networkStorageD.g();
            String string = metricsStorageG.toJSON().toString();
            Request request = new Request(a(networkStorageD) + NetworkConsts.CORE);
            request.addParameter("id", SDKClient.getInstance().getApplicationKey());
            request.addParameter(RequestParams.UID, aVar.a());
            request.addParameter(RequestParams.PREV, aVar.b());
            if (zG) {
                request.addParameter(RequestParams.CUID, metricsStorageG.getUserId());
                request.addParameter(RequestParams.PREV_CUID, metricsStorageG.getPrevUserId());
            }
            request.setNeedSigned(true);
            request.setPostData(string.getBytes());
            new CoreAsyncTask(new e(aVar, metricsStorageG)).execute(request);
        }
    }

    static void a(Context context, NetworkStorage networkStorage, ArrayList<MetricsStorage> arrayList) {
        if (networkStorage != null && networkStorage.c().length() != 0) {
            DeviceUtils.getDeviceIDs(context, new d(networkStorage, arrayList));
        } else {
            CoreLog.i(f98264a, "Not active node server. Save ...");
            b(arrayList);
        }
    }

    private static String a(NetworkStorage networkStorage) {
        String str = f98266c;
        if (str == null) {
            str = "";
        }
        return networkStorage.c() + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ArrayList<MetricsStorage> arrayList) {
        SDKClient.getInstance().getUsersStorages().a(arrayList);
        SDKClient.getInstance().d();
    }
}
