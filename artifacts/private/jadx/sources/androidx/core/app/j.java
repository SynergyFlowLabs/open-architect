package androidx.core.app;

import android.content.Context;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f47040a = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f47041b = "application_locales";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f47042c = "locales";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f47043d = "AppLocalesStorageHelper";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final boolean f47044e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f47045f = new Object();

    private j() {
    }

    public static void a(@NonNull Context context, @NonNull String str) {
        synchronized (f47045f) {
            try {
                if (str.equals("")) {
                    context.deleteFile(f47040a);
                    return;
                }
                try {
                    FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(f47040a, 0);
                    XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, f47042c);
                        xmlSerializerNewSerializer.attribute(null, f47041b, str);
                        xmlSerializerNewSerializer.endTag(null, f47042c);
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Exception unused2) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    } catch (Throwable th2) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th2;
                    }
                } catch (FileNotFoundException unused4) {
                    String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", f47040a);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @NonNull
    public static String b(@NonNull Context context) {
        String attributeValue;
        synchronized (f47045f) {
            attributeValue = "";
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput(f47040a);
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    int depth = xmlPullParserNewPullParser.getDepth();
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                            if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals(f47042c)) {
                                attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, f47041b);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException | XmlPullParserException unused2) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                } catch (Throwable th2) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th2;
                }
                if (attributeValue.isEmpty()) {
                    context.deleteFile(f47040a);
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }
}
