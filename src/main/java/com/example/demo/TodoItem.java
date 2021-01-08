package com.example.demo;

public class TodoItem {
        private TodoOwner owner;
        private String title;
        private String Urgency;
        private String requester;
        private String description;

        public TodoItem(TodoOwner owner, String title, String urgency, String requester, String description) {
            this.owner = owner;
            this.title = title;
            Urgency = urgency;
            this.requester = requester;
            this.description = description;
        }

        public String getRequester() {
            return requester;
        }

        public TodoOwner getOwner() {
            return owner;
        }

        public String getTitle() {
            return title;
        }

        public String getUrgency() {
            return Urgency;
        }

        public String getDescription() {
            return description;
        }

}
