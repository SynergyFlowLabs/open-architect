package d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.devtodev.core.utils.IOUtils;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static String a(Context context) {
        if (context == null) {
            return null;
        }
        String strC = c(context, "store_for_udid");
        if (strC == null) {
            strC = b(context, "store_for_udid");
            if (strC == null) {
                strC = UUID.randomUUID().toString();
            }
            IOUtils.saveString(context, "store_for_udid", strC);
        }
        return strC;
    }

    private static String b(Context context, String str) {
        ApplicationInfo applicationInfo;
        File fileStreamPath = context.getFileStreamPath(str);
        try {
            try {
                PackageManager packageManager = context.getPackageManager();
                try {
                    applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException e10) {
                    e10.printStackTrace();
                    applicationInfo = null;
                }
                String canonicalPath = fileStreamPath.getCanonicalPath();
                if (applicationInfo != null && canonicalPath.startsWith(applicationInfo.dataDir)) {
                    String strSubstring = canonicalPath.substring(applicationInfo.dataDir.length());
                    List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
                    if (installedApplications != null) {
                        Iterator<ApplicationInfo> it = installedApplications.iterator();
                        while (it.hasNext()) {
                            File file = new File(it.next().dataDir, strSubstring);
                            if (file.exists()) {
                                fileStreamPath = file;
                                break;
                            }
                        }
                    }
                }
                if (fileStreamPath.exists()) {
                    return IOUtils.loadString(fileStreamPath);
                }
            } catch (IOException e11) {
                e11.printStackTrace();
                if (fileStreamPath.exists()) {
                    return IOUtils.loadString(fileStreamPath);
                }
            }
            return null;
        } catch (Throwable th2) {
            if (fileStreamPath.exists()) {
                return IOUtils.loadString(fileStreamPath);
            }
            throw th2;
        }
    }

    private static String c(Context context, String str) {
        File fileStreamPath = context.getFileStreamPath(str);
        if (fileStreamPath.exists()) {
            return IOUtils.loadString(fileStreamPath);
        }
        return null;
    }
}
