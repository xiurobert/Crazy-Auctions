package me.badbones69.crazyauctions.api.multiworld;

import me.badbones69.crazyauctions.api.interfaces.AuctionItem;

import java.util.ArrayList;
import java.util.List;

public class WorldGroup {
    
    private String id;
    private List<String> worlds = new ArrayList<>();
    private List<AuctionItem> auctionItems = new ArrayList<>();
    
    public WorldGroup(String id, List<String> worlds) {
        this.id = id;
        this.worlds.addAll(worlds);
    }
    
    public String getID() {
        return id;
    }
    
    public List<String> getWorlds() {
        return worlds;
    }
    
    public void addAuctionItem(AuctionItem auctionItem) {
        auctionItems.add(auctionItem);
    }
    
    public void removeAuctionItem(AuctionItem auctionItem) {
        auctionItems.remove(auctionItem);
    }
    
    public List<AuctionItem> getAuctionItems() {
        return auctionItems;
    }
    
}