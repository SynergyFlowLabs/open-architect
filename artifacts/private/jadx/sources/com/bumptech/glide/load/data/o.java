package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class o extends l<InputStream> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f96360e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f96361f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f96362g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f96363h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f96364i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final UriMatcher f96365j;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f96365j = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        int i10 = 3 | 3;
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public o(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private InputStream h(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f96365j.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return i(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return i(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    private InputStream i(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.l
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public InputStream e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamH = h(uri, contentResolver);
        if (inputStreamH != null) {
            return inputStreamH;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
