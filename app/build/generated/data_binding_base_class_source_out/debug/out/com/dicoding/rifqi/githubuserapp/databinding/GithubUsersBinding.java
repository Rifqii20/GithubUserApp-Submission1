// Generated by view binder compiler. Do not edit!
package com.dicoding.rifqi.githubuserapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dicoding.rifqi.githubuserapp.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GithubUsersBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final CircleImageView imgItemPhoto;

  @NonNull
  public final TextView tvItemName;

  @NonNull
  public final TextView tvItemUsername;

  private GithubUsersBinding(@NonNull CardView rootView, @NonNull CardView cardView,
      @NonNull CircleImageView imgItemPhoto, @NonNull TextView tvItemName,
      @NonNull TextView tvItemUsername) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.imgItemPhoto = imgItemPhoto;
    this.tvItemName = tvItemName;
    this.tvItemUsername = tvItemUsername;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static GithubUsersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GithubUsersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.github_users, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GithubUsersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.img_item_photo;
      CircleImageView imgItemPhoto = ViewBindings.findChildViewById(rootView, id);
      if (imgItemPhoto == null) {
        break missingId;
      }

      id = R.id.tv_item_name;
      TextView tvItemName = ViewBindings.findChildViewById(rootView, id);
      if (tvItemName == null) {
        break missingId;
      }

      id = R.id.tv_item_username;
      TextView tvItemUsername = ViewBindings.findChildViewById(rootView, id);
      if (tvItemUsername == null) {
        break missingId;
      }

      return new GithubUsersBinding((CardView) rootView, cardView, imgItemPhoto, tvItemName,
          tvItemUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
