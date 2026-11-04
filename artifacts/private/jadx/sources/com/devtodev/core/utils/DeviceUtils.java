package com.devtodev.core.utils;

import android.content.Context;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.devtodev.core.logic.SDKClient;
import com.devtodev.core.logic.UsersStorages;
import com.devtodev.core.utils.log.CoreLog;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceUtils {
    public static String CurrentAdId = null;
    public static final String TAG = "DeviceUtils";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f98334a;

    static class b extends AsyncTask<Void, Void, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f98342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f98343b;

        b(f fVar, Context context) {
            this.f98342a = fVar;
            this.f98343b = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            String id2;
            f fVar;
            String str = DeviceUtils.CurrentAdId;
            if (str != null && (fVar = this.f98342a) != null) {
                fVar.a(str, DeviceUtils.f98334a);
                return null;
            }
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f98343b);
                boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                id2 = advertisingIdInfo.getId();
                try {
                    DeviceUtils.CurrentAdId = id2;
                    boolean unused = DeviceUtils.f98334a = zIsLimitAdTrackingEnabled;
                    f fVar2 = this.f98342a;
                    if (fVar2 == null) {
                        return id2;
                    }
                    fVar2.a(id2, zIsLimitAdTrackingEnabled);
                    return id2;
                } catch (Error unused2) {
                    CoreLog.e("DevToDev", "Error while get AdvertiserID");
                    f fVar3 = this.f98342a;
                    if (fVar3 != null) {
                        fVar3.a(null, false);
                    }
                    return id2;
                } catch (Exception e10) {
                    e = e10;
                    CoreLog.e("DevToDev", "Error while get AdvertiserID : " + e.getMessage());
                    f fVar4 = this.f98342a;
                    if (fVar4 != null) {
                        fVar4.a(null, false);
                    }
                    return id2;
                }
            } catch (Error unused3) {
                id2 = null;
            } catch (Exception e11) {
                e = e11;
                id2 = null;
            }
        }
    }

    private static Point b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static void getAdvertiserID(Context context, f fVar) {
        a(context, fVar);
    }

    @e.a({"HardwareIds"})
    public static String getAndroidID(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static long getCurrentUnixTime() {
        return System.currentTimeMillis() / 1000;
    }

    public static long getCurrentUnixTimeInMillis() {
        return System.currentTimeMillis();
    }

    public static void getDeviceIDs(Context context, g gVar) {
        String str;
        String str2;
        String str3;
        String str4;
        if (gVar == null) {
            return;
        }
        UsersStorages usersStorages = SDKClient.getInstance().getUsersStorages();
        String strA = d.a.a(context);
        if (usersStorages != null) {
            String[] savedAdvertisingIds = getSavedAdvertisingIds(usersStorages);
            str = savedAdvertisingIds[0];
            String str5 = savedAdvertisingIds[1];
            String[] strArrA = a(usersStorages);
            str3 = strArrA[0];
            str4 = strArrA[1];
            str2 = str5;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        getAdvertiserID(context, new a(str, str2, gVar, usersStorages, strA, str3, str4));
    }

    public static String getDeviceId(Context context) {
        return d.a.a(context);
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String[] getSavedAdvertisingIds(UsersStorages usersStorages) {
        String savedAdvertisingId = usersStorages.getSavedAdvertisingId();
        if (savedAdvertisingId == null) {
            return new String[]{null, null};
        }
        String[] strArrSplit = savedAdvertisingId.split(":");
        return new String[]{strArrSplit.length > 0 ? strArrSplit[0] : null, strArrSplit.length > 1 ? strArrSplit[1] : null};
    }

    public static int getScreenDpi(Context context) {
        return (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    public static double getScreenInches(Context context) {
        Point pointB = b(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return d.a(Math.sqrt(Math.pow(((double) pointB.x) / ((double) displayMetrics.xdpi), 2.0d) + Math.pow(((double) pointB.y) / ((double) displayMetrics.ydpi), 2.0d)), 2);
    }

    public static Point getScreenResolutionSorted(Context context) {
        Point pointB = b(context);
        return new Point(Math.max(pointB.x, pointB.y), Math.min(pointB.x, pointB.y));
    }

    @e.a({"HardwareIds"})
    public static String getSerialId() {
        return Build.SERIAL;
    }

    public static int getTimeZoneOffset() {
        return TimeZone.getDefault().getOffset(new Date().getTime()) / 1000;
    }

    public static String getAdvertiserID() {
        return CurrentAdId;
    }

    private static String[] a(UsersStorages usersStorages) {
        String str;
        String savedUdids = usersStorages.getSavedUdids();
        String str2 = null;
        if (savedUdids != null) {
            String[] strArrSplit = savedUdids.split(":");
            String str3 = strArrSplit.length > 0 ? strArrSplit[0] : null;
            str = strArrSplit.length > 1 ? strArrSplit[1] : null;
            str2 = str3;
        } else {
            str = null;
        }
        return new String[]{str2, str};
    }

    private static void a(Context context, f fVar) {
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            new b(fVar, context).execute(new Void[0]);
        } catch (ClassNotFoundException unused) {
            CoreLog.e("DevToDev", "AdvertisingIdClient class not found. Please connect Google Play Services to your project.");
            if (fVar != null) {
                fVar.a(null, false);
            }
        }
    }

    static class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f98336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f98337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ UsersStorages f98338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f98339e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f98340f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f98341g;

        a(String str, String str2, g gVar, UsersStorages usersStorages, String str3, String str4, String str5) {
            this.f98335a = str;
            this.f98336b = str2;
            this.f98337c = gVar;
            this.f98338d = usersStorages;
            this.f98339e = str3;
            this.f98340f = str4;
            this.f98341g = str5;
        }

        @Override // com.devtodev.core.utils.f
        public void a(String str, boolean z10) {
            String str2 = this.f98335a;
            if (str2 != null) {
                a(str, str2, this.f98336b, this.f98337c, true, z10);
                return;
            }
            if (str != null && !z10) {
                UsersStorages usersStorages = this.f98338d;
                if (usersStorages != null) {
                    usersStorages.setSavedAdvertisingId(str);
                }
                this.f98337c.a(str, this.f98339e);
                return;
            }
            String str3 = this.f98340f;
            if (str3 != null) {
                a(this.f98339e, str3, this.f98341g, this.f98337c, false, z10);
                return;
            }
            UsersStorages usersStorages2 = this.f98338d;
            if (usersStorages2 != null) {
                usersStorages2.setSavedUdids(this.f98339e);
            }
            this.f98337c.a(this.f98339e, null);
        }

        private void a(String str, String str2, String str3, g gVar, boolean z10, boolean z11) {
            if (str == null && str2 == null && str3 == null) {
                return;
            }
            if (str2 == null && str3 != null) {
                str2 = str3;
            }
            if (str == null || (z10 && z11)) {
                str = str2;
            }
            if (str != null && str.equals(str2)) {
                if (str3 != null) {
                    gVar.a(str, str3);
                    return;
                } else {
                    gVar.a(str, z10 ? this.f98339e : null);
                    return;
                }
            }
            String str4 = str + ":" + str2;
            UsersStorages usersStorages = this.f98338d;
            if (usersStorages != null) {
                if (z10) {
                    usersStorages.setSavedAdvertisingId(str4);
                } else {
                    usersStorages.setSavedUdids(str4);
                }
            }
            gVar.a(str, str2);
        }
    }

    private static Point a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
