package com.parkingkoi.service.golpo.interfaces;

import android.view.View;

import com.parkingkoi.service.golpo.models.Group;
import com.parkingkoi.service.golpo.models.User;

/**
 * Created by a_man on 5/10/2017.
 */

public interface ChatItemClickListener {
    void onChatItemClick(String chatId, String chatName, int position, View userImage);

    void onChatItemClick(Group group, int position, View userImage);

    void placeCall(boolean callIsVideo, User user);
}
